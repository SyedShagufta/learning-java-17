package com.java.encapsulationChallenge;

public class BankAccount {

    private long accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    // creating getters and setters for the above fields

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = (accountBalance > 0) ? accountBalance : 0;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(float amount){
        if(amount > 0){
            accountBalance += amount;
            printBalance();
        }else{
            System.out.println("Please check and provide valid input.");
        }
    }

    public void withdraw(float amount){
        if(amount > 0 && accountBalance >= amount){
            accountBalance -= amount;
            printBalance();
        }else{
            System.out.println("Please check and provide valid input.");
        }
    }

    public void printBalance(){
        System.out.println("===================".repeat(20));
        System.out.println("Thank you for Banking with us.");
        System.out.printf("The Balance after the transaction is %.2f\n", accountBalance);
    }
}
