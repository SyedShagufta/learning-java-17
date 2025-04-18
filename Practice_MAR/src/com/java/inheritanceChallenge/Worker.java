package com.java.inheritanceChallenge;


import java.time.LocalDate;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    // This works when we get the birthday in the form of yyyy-mm-dd
    public int getAge(){
        int age;
        String date = String.valueOf(LocalDate.now());
        String[] dateArr = date.split("-");
        String[] birthdateArr = birthDate.split("-");
        if(Integer.parseInt(dateArr[0]) >= Integer.parseInt(birthdateArr[0])) {
            // if today is my birthday or I completed my birthday
            if (Integer.parseInt(birthdateArr[1]) < Integer.parseInt(dateArr[1])
                    || (Integer.parseInt(birthdateArr[1]) == Integer.parseInt(dateArr[1]) && Integer.parseInt(birthdateArr[2]) <= Integer.parseInt(dateArr[2]))) {
                age = Integer.parseInt(dateArr[0]) - Integer.parseInt(birthdateArr[0]);
            }
            else{
                age = Integer.parseInt(dateArr[0])-Integer.parseInt(birthdateArr[0])-1;
            }
        }
        else{
            age=-1;
        }

        return age;
    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        System.out.println("Terminated on "+endDate);
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
