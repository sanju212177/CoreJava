package com.capgemini.Feb21;

public class Employee {
	private int empId;
    private String name;
    private int deptId;
    private String status;
    private int salary;
    
    public Employee(int empId, String name, int deptId, String status, int salary) {
        this.empId = empId;
        this.name = name;
        this.deptId = deptId;
        this.status = status;
        this.salary = salary;
    }
    
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
