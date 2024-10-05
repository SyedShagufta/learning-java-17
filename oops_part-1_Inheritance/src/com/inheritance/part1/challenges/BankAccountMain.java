package com.inheritance.part1.challenges;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.setCustomerName("Sofia");
        myAccount.setEmail("sofi@gmail.com");
        myAccount.setPhoneNumber(7894561238L);
//        System.out.println(myAccount.getCustomerName()+", Your email is "+myAccount.getEmail()+" and your account number is "+myAccount.getAccountNumber()+" " +
//                " Your current balance is "+myAccount.getAccountBalance());
//        myAccount.depositMoney(100000);
        System.out.println(myAccount.getCustomerName()+", Your email is "+myAccount.getEmail()+" and your account number is "+myAccount.getAccountNumber()+" " +
                " Your current balance is "+myAccount.getAccountBalance());
        myAccount.withdrawMoney(10000);
        System.out.println(myAccount.getCustomerName()+", Your email is "+myAccount.getEmail()+" and your account number is "+myAccount.getAccountNumber()+" " +
                " Your current balance is "+myAccount.getAccountBalance());

    }
}
