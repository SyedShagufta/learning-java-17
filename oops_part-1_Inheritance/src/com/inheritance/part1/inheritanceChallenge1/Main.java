package com.inheritance.part1.inheritanceChallenge1;

public class Main {

    public static void main(String[] args) {

//        SalariedEmployee sofia = new SalariedEmployee("Sofia", "2002-03-26");
//
//        System.out.println(sofia.getAge());
//        System.out.println(sofia.collectPay());

        Employee sofia = new Employee("sofia", "2002-03-26", "2024-02-07");
        System.out.println(sofia);
        System.out.println("Age = "+sofia.getAge());
        System.out.println("Pay = "+sofia.collectPay());

        Employee john = new Employee("john", "2001-02-05", "2024-02-07");
        System.out.println(john);
        System.out.println("Age = "+john.getAge());
        System.out.println("Pay = "+john.collectPay());

    }

}
