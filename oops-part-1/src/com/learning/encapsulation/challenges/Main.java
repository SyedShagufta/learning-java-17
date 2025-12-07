package com.learning.encapsulation.challenges;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        // setting the values
        myAccount.setAccountNumber(190031562);
        myAccount.setAccountBalance(10000);
        myAccount.setCustomerName("Sofia");
        myAccount.setEmail("sofia@gmail.com");
        myAccount.setPhoneNumber(1234567890);
        // Testing the withdrawal method
        myAccount.withdraw(20000); // This should throw us an error
        myAccount.withdraw(5000); // This should work
        myAccount.deposit(-900); // This should throw us an error
        myAccount.deposit(5000); // This should work

    }

}
