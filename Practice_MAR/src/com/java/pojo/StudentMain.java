package com.java.pojo;

public class StudentMain {

    public static void main(String[] args) {

        for(int i=1; i<=5;i++){
            Student s = new Student(
                    "S19003156",
                    switch (i){
                        case 1 -> "Sofia";
                        case 2 -> "Gk";
                        case 3 -> "John";
                        case 4 -> "Joel";
                        case 5 -> "Sofia Gk";
                        default -> "Anonymous";
                    },
                    "05/19/2000",
                    "Java, Python"
            );
            System.out.println(s);
        }

    }

}
