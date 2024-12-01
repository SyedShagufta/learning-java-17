package com.learning.autoboxingChallenge;

import com.learning.autoboxingChallenge.Customer;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction) {
        // Check if customer already exists
        if (findCustomer(customerName) != null) {
            return false; // Customer already exists
        }

        // Customer does not exist, add them
        Customer c = new Customer(customerName, transaction); // Use the correct constructor
        customers.add(c);
        return true; // Customer successfully added
    }


    public boolean addCustomerTransaction(String customerName, double transaction)
    {
        if(findCustomer(customerName) !=null){
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        return false;
    }

    

    private Customer findCustomer(String customerName){
        for(Customer c: customers){
            if(c.getName().equals(customerName)){
                return c;
            }
        }
        return null;
    }

}
