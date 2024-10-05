package com.inheritance.part1.challenges;

public class CustomerMain {

    public static void main(String[] args) {
        Customer sofia = new Customer("Sofia", 98000, "sofia@gmail.com");
        Customer john = new Customer("John", "john@gmail.com");
        Customer testPerson = new Customer();

        System.out.println(sofia.getName()+" with an email address "+ sofia.getEmailAddress()+
                " has a credit score of "+sofia.getCreditLimit());

        System.out.println(john.getName()+" with an email address "+ john.getEmailAddress()+
                " has a credit score of "+john.getCreditLimit());

        System.out.println(testPerson.getName()+" with an email address "+ testPerson.getEmailAddress()+
                " has a credit score of "+testPerson.getCreditLimit());


    }

}
