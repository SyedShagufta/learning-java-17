package com.java.inheritance;

public class ObjectDemo extends Object{

    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);
        PrimaryClassStudent jimmy = new PrimaryClassStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }

}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" is "+age+" years old";
    }
}
class PrimaryClassStudent extends Student{
    private String parentName;

    public PrimaryClassStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, " + super.toString();
    }
}