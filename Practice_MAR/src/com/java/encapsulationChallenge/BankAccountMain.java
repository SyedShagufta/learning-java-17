package com.java.encapsulationChallenge;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
        myAcc.setAccountNumber(123456789);
        myAcc.setCustomerName("Sofia");
        myAcc.setEmail("sofia@gmail.com");
        myAcc.setPhoneNumber(1234567890);
        myAcc.setAccountBalance(10000);
        myAcc.printBalance();
        myAcc.withdraw(1500);
        myAcc.deposit(10000);
        myAcc.withdraw(20000);
    }
}
