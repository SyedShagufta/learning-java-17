package com.java.encapsulationChallenge;

public class Customer {
    private String name;
    private float creditLimit;
    private String emailAddress;

    // no-args constructor that calls another constructor passing some literal values for each argument

    public Customer() {
        this("default", "default@gmail.com");
    }

    // constructor with just name and email which calls another constructor

    public Customer(String name, String emailAddress) {
        this(name, 0, emailAddress);
    }


    //  constructor that assigns all arguments to the instance fields

    public Customer(String name, float creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    // The challenges says create just getters and no need to create setters

    public String getName() {
        return name;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
