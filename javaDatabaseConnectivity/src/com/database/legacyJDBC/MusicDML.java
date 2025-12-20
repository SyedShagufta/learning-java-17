package com.database.legacyJDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class MusicDML {


    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try(Connection connetion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/music",
                "root",
                "root");
            Statement statement = connetion.createStatement();
        ){
            // we know that neil young is not in the artists table
            String artist="Neil Young";
            String query="SELECT * FROM artists WHERE artist_name='%s'".formatted(artist);
            // we get boolean result as true everytime we use this with the select statement
            boolean result = statement.execute(query);
            System.out.println("result="+result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static  boolean printRecords(ResultSet resultSet) throws SQLException{

        boolean foundData=false;

        var meta = resultSet.getMetaData();
        // printing the headers
        for(int i=1;i<=meta.getColumnCount();i++){
            System.out.printf("-%15s",meta.getColumnName(i));
        }
        // print a new line
        System.out.println();

        // Now printing the rows in a formatted way
        while(resultSet.next()){
            for (int i=1; i<=meta.getColumnCount();i++){
                System.out.printf("-%15s",resultSet.getString(i));
            }
            System.out.println();
            foundData=true;
        }
        return foundData;
    }

    private static boolean executeSelect(Statement statement, String table,
                                         String columnName, String columnValue)
    throws SQLException{

        String query = "SELECT * FROM %s WHERE %s='%s'".formatted(table, columnName, columnValue);
        var rs = statement.executeQuery(query);
        
        if(rs!=null){
            return printRecords(rs);
        }

        return false;
    }


}
