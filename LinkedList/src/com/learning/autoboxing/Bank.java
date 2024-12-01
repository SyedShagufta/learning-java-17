package com.learning.autoboxing;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(Customer customer, double transaction)
    {
        boolean customerExists = false;
        for(Customer c: customers){
            if(c.equals(customer)){
                customerExists = true;
                System.out.println("Customer already exists! adding the transaction to the customer account");
                c.addTransaction(transaction);
                System.out.println("Customer : "+c.getName()+" Transactions : "+c.getTransactions());
            }
        }

        if(!customerExists){
            System.out.println("Customer doesn't exists!! Adding the customer and also the transaction to the customer account");
            customers.add(customer);
            customer.addTransaction(transaction);
            System.out.println("Customer : "+customer.getName()+" Transactions : "+customer.getTransactions());
        }

    }

}
