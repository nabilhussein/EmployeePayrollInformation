package com.example.payroll;

public class Employee {
    private String employeeID;
    private String employeeName;
    private double hoursWorks;
    private double payRate;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", hoursWorks=" + hoursWorks +
                ", payRate=" + payRate +
                '}';
    }

    public Employee(String employeeID, String employeeName, double hoursWorks, double payRate) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.hoursWorks = hoursWorks;
        this.payRate = payRate;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setHoursWorks(double hoursWorks) {
        this.hoursWorks = hoursWorks;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getHoursWorks() {
        return hoursWorks;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay(){
        return hoursWorks * payRate;

    }
}
