package com.capgemini.oops;

public class Manager extends Employee {
	 private double bonus;

    public Manager(String ename, double esalaray, double bonus) {
        super(ename, esalaray);
        this.bonus = bonus;
    }

    public double getBonus() {
	    return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager details:\n");
        super.displayEmployeeDetails();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+(bonus+getEmpSalary()));
    }
}
