package com.capgemini.febr18;

import java.util.*;
//import java.util.function.Consumer;
import java.util.stream.*;

public class EmployeeService {
	public double countSalary(List<Employee> employee) {
		return employee.stream().collect(Collectors.summingDouble(Employee::getSalary));
	}
	public void departmentDetails(List<Employee> emp) {
		Map<Integer,Long> dept = emp.stream().collect(Collectors.groupingBy(Department::getDepartmentId),Collectors.counting());
		System.out.println();
	}
	
	 
	
}
