package com.capgemini.febr18;

import java.time.LocalDate;

public class Employee {
	private int employeeId,managerId;
	private String firstName,lastName,email,phoneNumber,designation;
	private LocalDate hireDate;
	private double salary;
	private Department department;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int Id, String firstName, String lastName, String email, String phoneNumber,
			String designation, LocalDate hireDate, Department department, double salary) {
		super();
		if(designation.equalsIgnoreCase("manager")) {
			this.managerId = Id;
		}
		else
			this.employeeId = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.hireDate = hireDate;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", managerId=" + managerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", designation="
				+ designation + ", hireDate=" + hireDate + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
