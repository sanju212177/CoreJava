package com.capgemini.oops;

public class Employee {
	private String empname;
    private double empsalary;

    public Employee(String empname, double empsalary) {
        this.empname = empname;
        this.empsalary = empsalary;
    }

    public String getEmpName() {
        return empname;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public double getEmpSalary() {
        return empsalary;
    }

    public void setEmpSalary(double esalaray) {
        this.empsalary = esalaray;
    }

    public void displayEmployeeDetails(){
        System.out.println("Name: "+empname+"\nSalary: "+empsalary);
    }
}
