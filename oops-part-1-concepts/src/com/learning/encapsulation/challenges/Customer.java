package com.learning.encapsulation.challenges;

public class Customer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    // constructor overloading and constructor chaining example

    // All 3 arguments constructor
    public Customer(String customerName, double creditLimit, String emailAddress)
    {
        this.customerName=customerName;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
        System.out.println("Inside 3 arg constructor");
    }

    // Only name and email
    public Customer(String customerName, String emailAddress)
    {
        this(customerName, 0, emailAddress);
        System.out.println("Inside 2 arg constructor");
    }

    // default constructor - No Args constructor
    public Customer()
    {
        // Challenge says we need to pass literal values
        this("dummyValue",  "dummy@gmail.com");
        System.out.println("Inside no arg constructor");
    }


    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
