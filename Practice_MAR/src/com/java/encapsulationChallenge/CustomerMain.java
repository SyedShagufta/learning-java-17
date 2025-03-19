package com.java.encapsulationChallenge;

public class CustomerMain {
    public static void main(String[] args) {

        Customer sofia = new Customer("sofia", "sofia@gmal.com");
        System.out.println("Customer Name = "+sofia.getName());
        System.out.println("Customer credit limit = "+sofia.getCreditLimit());
        System.out.println("Customer Email = "+sofia.getEmailAddress());

        Customer newCustomer = new Customer();
        System.out.println("Customer Name = "+newCustomer.getName());
        System.out.println("Customer credit limit = "+newCustomer.getCreditLimit());
        System.out.println("Customer Email = "+newCustomer.getEmailAddress());

        Customer Gk = new Customer("GK", 10000, "gk@gmail.com");
        System.out.println("Customer Name = "+Gk.getName());
        System.out.println("Customer credit limit = "+Gk.getCreditLimit());
        System.out.println("Customer Email = "+Gk.getEmailAddress());
    }
}
