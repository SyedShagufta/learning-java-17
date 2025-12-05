package com.learning.encapsulation.challenges;

public class CustomerMain {

    public static void main(String[] args) {

        // Testing the 3 constructors
        // no arg constructor
        Customer dummy = new Customer();
        System.out.println("Dummy Object Name : "+dummy.getCustomerName());
        System.out.println("Dummy Object credit limit: "+dummy.getCreditLimit());
        System.out.println("Dummy Oject Email: "+dummy.getEmailAddress());

        // 2 arg constructor
        Customer bob = new Customer("Bob", "bob@gmail.com");
        System.out.println("Dummy Object Name : "+bob.getCustomerName());
        System.out.println("Dummy Object credit limit: "+bob.getCreditLimit());
        System.out.println("Dummy Oject Email: "+bob.getEmailAddress());

        // 3 arg constructor
        Customer michelle = new Customer("Michelle", 120000, "michelle@gmail.com");
        System.out.println("Dummy Object Name : "+michelle.getCustomerName());
        System.out.println("Dummy Object credit limit: "+michelle.getCreditLimit());
        System.out.println("Dummy Oject Email: "+michelle.getEmailAddress());

    }

}
