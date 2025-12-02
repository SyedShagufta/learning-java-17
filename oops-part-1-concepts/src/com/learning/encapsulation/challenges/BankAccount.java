package com.learning.encapsulation.challenges;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Method to deposit the funds
    public void deposit(double amount)
    {
        System.out.println("----".repeat(10));
        System.out.printf("Depositing the amount %.2f to your account%n",amount);
        if(amount > 0){
            System.out.println("----".repeat(10));
            accountBalance+=amount;
        }else{
            System.out.println("Please enter amount greater than zero to deposit");
        }
        printBalance();
    }

    // Method to withdraw funds
    public void withdraw(double amount)
    {
        if(amount > 0){
            double remainingBal = accountBalance - amount;
            System.out.println("----".repeat(10));
            System.out.printf("Withdrawing the amount %.2f from your account%n",amount);
            if(remainingBal>=0){
                System.out.println("----".repeat(10));
                accountBalance-=amount;
            }else{
                System.out.println("Insufficient funds");
            }
            printBalance();
        }else{
            System.out.println("Please enter amount greater than zero to withdraw");
        }
    }

    // Method to display the account Balance
    private void printBalance()
    {
        System.out.printf("Current Balance = %.2f%n",accountBalance);
        System.out.println("====".repeat(10));
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
