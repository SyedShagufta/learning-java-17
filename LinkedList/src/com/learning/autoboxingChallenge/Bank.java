package com.learning.autoboxingChallenge;

import com.learning.autoboxingChallenge.Customer;

import java.util.ArrayList;
import java.util.Date;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name)==null) {
            return branches.add(new Branch(name));
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        for (Branch b : branches) {
            if (b.getName().equals(branchName)) {
                // Call newCustomer and return its result
                return b.newCustomer(customerName, initialTransaction);
            }
        }
        return false; // Branch not found
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        if(findBranch(branchName) != null){
            for(Customer c : findBranch(branchName).getCustomers()){
                if(c.getName().equals(customerName)){
                    c.addTransaction(transactionAmount);
                    return true;
                }
            }
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(Branch b : branches){
            if(b.getName().equals(branchName)){
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        if(findBranch(branchName) != null && printTransactions){
            System.out.println("Customer details for branch "+branchName);
            int i=1;
            for(Customer c: findBranch(branchName).getCustomers()){
                System.out.printf("Customer: %s[%d]%n" , c.getName(), i++);
                System.out.println("Transactions");
                ArrayList<Double> t = c.getTransactions();
                for(int j=0; j<t.size();j++){
                    System.out.printf("[%d] Amount %.2f%n", j+1, t.get(j));
                }
            }
            return true;
        }
        else if(findBranch(branchName) != null && !printTransactions){
            System.out.println("Customer details for branch "+branchName);
            int i=1;
            for(Customer c: findBranch(branchName).getCustomers()) {
                System.out.printf("Customer: %s[%d]%n", c.getName(), i++);
            }
            return true;
        }
        return false;
    }
}
