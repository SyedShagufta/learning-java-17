package com.inheritance.part1.inheritanceChallenge1;

public class Worker {

    private String name;
    private String dateOfBirth;
    private static String endDate;

    public Worker(String name, String dateOfBirth)
    {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public int getAge(){
        int birthYear = Integer.parseInt(dateOfBirth.substring(0, 4));
        int birthMonth = Integer.parseInt(dateOfBirth.substring(5, 7));
        int birthDay = Integer.parseInt(dateOfBirth.substring(8, 10));

        int age = 2024 - birthYear;

        // check if the birthday hasn't occurred this year
        return (birthMonth > 10 || (birthMonth == 10 && birthDay > 1)) ? age-1 : age;


    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        Worker.endDate = endDate;
        System.out.println("terminated on "+endDate);
    }


}
