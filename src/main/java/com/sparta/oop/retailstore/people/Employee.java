package com.sparta.oop.retailstore.people;

public class Employee extends Person {

    private String department;
    private double salary;
    private int employeeId;

    public Employee(final String firstName, final String lastName, final String department, final double salary, final int employeeId) {
        super(firstName, lastName, employeeId);
        this.department = department;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public String getDepartment() { return department; }

    public double getSalary() { return salary; }

    public int getEmployeeId() { return employeeId; }

    @Override
    public String toString() {
        return "Employee #" + employeeId + ": " + super.toString() + ", " + department;
    }

}
