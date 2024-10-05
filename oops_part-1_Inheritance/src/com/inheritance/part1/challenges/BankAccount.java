package com.inheritance.part1.challenges;

public class BankAccount {

    private long accountNumber=123456789;
    private long accountBalance=0;
    private String customerName;
    private String email;
    private long phoneNumber;

    // method to deposit funds into the account
    public void depositMoney(long money)
    {
        if(money > 0) {
            this.accountBalance += money;
            System.out.println("Your account is credited with " + money);
            System.out.println("Your new balance is " + this.accountBalance);
        }else{
            System.out.println("Please enter a valid amount");
        }
    }

    // method to withdraw funds from the account
    public void withdrawMoney(long money)
    {
        if(accountBalance < money)
        {
            System.out.println("Sorry, Insufficient Balance");
        }else {
            this.accountBalance -= money;
            System.out.println("Your account is debited with " + money);
            System.out.println("Your remaining balance is " + this.accountBalance);
        }
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
