package com.java.pojo;

public class LPAStudentMain {

    public static void main(String[] args) {
        // Record instance
        LPAStudent sofia = new LPAStudent("190031562", "Sofia", "05/10/2000", "Java python");
        // Pojo instance
        Student sofiaPojo = new Student("190031561", "Sofia Pojo", "09/03/1999", "C, C++");

        System.out.println(sofiaPojo);
        System.out.println(sofia);

        // using getter methods
        System.out.println(sofiaPojo.getName()+" is taking "+sofiaPojo.getClassList());
        System.out.println(sofia.name()+" is taking "+sofia.classList());

        // using setter methods
        sofiaPojo.setClassList(sofiaPojo.getClassList()+" Python");
        System.out.println(sofiaPojo.getClassList());
       //  sofia.setClassList() - gives error because record is immutable

    }

}
