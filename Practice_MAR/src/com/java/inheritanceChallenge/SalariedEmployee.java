package com.java.inheritanceChallenge;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private final double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary=annualSalary;
        this.isRetired=isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary=annualSalary;
    }

    public SalariedEmployee(String name, String birthDate,  long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary=annualSalary;
    }

    public void retire(){
        super.terminate(String.valueOf(LocalDate.now()));
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return  (isRetired)? annualSalary/26 :annualSalary/12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
