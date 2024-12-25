package com.learning.challenges;

import java.util.Scanner;

public class MyNATOChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase();
        char[] cArr = name.toCharArray();
        for (char c : cArr) {
            System.out.printf("%c for %s%n", c, getNatoForChar(c));
        }
    }

    public static String getNatoForChar(char c)
    {
        return switch (c)
        {
            case 'A' -> "Apple";
            case 'B' -> "Ball";
            case 'C' -> "Cat";
            case 'D' -> "Dog";
            case 'E' -> "Elephant";
            case 'F' -> "Frog";
            case 'G' -> "Grass";
            case 'H' -> "Horse";
            case 'I' -> "Ice cream";
            case 'J' -> "Joker";
            case 'K' -> "Kite";
            case 'L' -> "Lemon";
            case 'M' -> "Mango";
            case 'N' -> "Napkin";
            case 'O' -> "Orange";
            case 'P' -> "Parrot";
            case 'Q' -> "Quill";
            case 'R' -> "Rabbit";
            case 'S' -> "Shop";
            case 'T' -> "Table";
            case 'U' -> "Umbrella";
            case 'V' -> "Van";
            case 'W' -> "Window";
            case 'X' -> "Xylophone";
            case 'Y' -> "Yak";
            case 'Z' -> "Zebra";
            default -> "Sorry! Not an Alphabet";
        };
    }

}
