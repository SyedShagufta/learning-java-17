package com.learning.pojo;

public class Main {

    public static void main(String[] args) {

        // let's insert some student data

        for(int i=0;i<=5;i++)
        {
            Student s = new Student(
              "S92300"+i,
                    switch(i){
                        case 0 -> "Carol";
                        case 1 -> "Lisa";
                        case 2 -> "Elena";
                        case 3 -> "Priya";
                        case 4 -> "Lakshmi";
                        case 5 -> "Damon";
                        default -> "Anonymous";
                    },
                    "25/12/2024",
                    "Java Master class 2024"
            );

            System.out.println(s);
        }

        Student myStudent = new Student("S923006", "Elena", "25/12/1985", "Java Master class 2024");

        SchoolStudent mySchoolStudent = new SchoolStudent("S923007", "Stefan", "23/12/1987", "Java Master class 2024");

        System.out.println(myStudent.getName()+" is taking "+myStudent.getClassList());

        System.out.println(mySchoolStudent.name()+" is taking "+mySchoolStudent.classList());

        myStudent.setClassList(myStudent.getClassList()+" New version");

        System.out.println(myStudent);

    }
}
