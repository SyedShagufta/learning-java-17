package com.inheritance.part1.challenges;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // 1st constructor
    public Customer(String name, double creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // 2nd constructor
    public Customer()
    {
        this("default", "default@gmail.com");
    }

    // 3rd constructor
    public Customer(String name, String emailAddress)
    {
        this(name, 10000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
