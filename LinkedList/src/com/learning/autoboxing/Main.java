package com.learning.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("sofia", new ArrayList<>(List.of(100.0, 200.0, 300.0, 400.0, 500.0, 650.0, 780.0)));
        Customer c2 = new Customer("Kashifa", new ArrayList<>(List.of(500.0, 200.0, 300.0, 400.0, 500.0, 650.0, 780.0)));
        Customer c3 = new Customer("Misbaha", new ArrayList<>(List.of(780.0, 200.0, 300.0, 400.0, 500.0, 650.0, 780.0)));
        Customer c4 = new Customer("taj", new ArrayList<>(List.of(300.0, 200.0, 300.0, 400.0, 500.0, 650.0, 780.0)));
        Customer c5 = new Customer("john", new ArrayList<>(List.of(789.0, 200.0, 300.0, 400.0, 500.0, 650.0, 780.0)));

        Bank stateBankOfIndia = new Bank("State Bank Of India", new ArrayList<Customer>(List.of(c1, c2, c3, c4, c5)));

        System.out.println(stateBankOfIndia);

        // adding a transaction to existing customer
        stateBankOfIndia.addTransaction(c1, 10000.0);
        // adding a transaction to customer that doesn't exist
        Customer newCustomer = new Customer("joel");
        stateBankOfIndia.addTransaction(newCustomer, 1500.0);
    }

}
