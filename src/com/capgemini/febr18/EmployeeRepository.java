package com.capgemini.febr18;

import java.time.LocalDate;
import java.util.*;

public class EmployeeRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "ab", "yz", "a@mail.com", "91xxxxxx89", "employee", LocalDate.of(2007,02,12),new Department(101,2,"HR"), 30000.0));
		employee.add(new Employee(2, "cd", "wx", "b@mail.com", "92xxxxxx70", "manager", LocalDate.of(2007,02,12),new Department(101,2,"HR"), 60000.0));
		employee.add(new Employee(3, "ef", "uv", "c@mail.com", "93xxxxxx69", "employee", LocalDate.of(2007,02,12),new Department(101,2,"HR"), 30000.0));
		employee.add(new Employee(4, "gh", "st", "d@mail.com", "94xxxxxx58", "employee", LocalDate.of(2007,02,12),new Department(101,2,"HR"), 30000.0));
		employee.add(new Employee(5, "ij", "qr", "e@mail.com", "95xxxxxx47", "manager", LocalDate.of(2007,02,12),new Department(103,5,"IT"), 60000.0));
		employee.add(new Employee(6, "kl", "mp", "f@mail.com", "96xxxxxx36", "employee", LocalDate.of(2007,02,12),new Department(103,5,"IT"), 30000.0));
		employee.add(new Employee(7, "mn", "nm", "g@mail.com", "97xxxxxx25", "employee", LocalDate.of(2007,02,12),new Department(103,5,"IT"), 30000.0));
		employee.add(new Employee(8, "op", "lk", "h@mail.com", "98xxxxxx14", "employee", LocalDate.of(2007,02,12),new Department(103,5,"IT"), 30000.0));
		EmployeeService es = new EmployeeService();
		System.out.println("Salary of all Employees : "+es.countSalary(employee));
	}
}
