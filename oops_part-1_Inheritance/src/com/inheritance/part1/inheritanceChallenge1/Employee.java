package com.inheritance.part1.inheritanceChallenge1;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNo=1;


    public Employee(String name, String dateOfBirth, String hireDate) {
        super(name, dateOfBirth);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
