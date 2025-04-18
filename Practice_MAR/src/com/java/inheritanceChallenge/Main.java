package com.java.inheritanceChallenge;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee sofia = new SalariedEmployee("Sofia", "2000-03-25", 190031562,
                "2024-02-07", 450000);

        System.out.println(sofia.getAge());
        System.out.println(sofia.collectPay());
        System.out.println(sofia);

        sofia.retire();
        System.out.println(sofia.collectPay());

    }
}
