package com.capgemini.Feb21;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"raza", 55, "inactive", 2000));
        employeeList.add(new Employee(102,"shiva", 55, "active", 3000));
        employeeList.add(new Employee(103,"rama", 44, "active", 4000));
        employeeList.add(new Employee(104,"ramya", 44, "inactive", 3000));
        employeeList.add(new Employee(105,"sai", 77, "active", 6000));
        employeeList.add(new Employee(106,"krishna", 66, "active", 5000));
        employeeList.add(new Employee(107,"murali", 77, "inactive", 8000));
        
        
        Optional<Employee> maxSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(maxSalary);
        
        Optional<Employee> minSalary = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(minSalary);
        
        Map<Integer, Optional<Employee>> maxDeptSalary =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingInt(Employee::getSalary)))));
        System.out.println(maxDeptSalary);
        
		/*
		 * Map<Integer, List<Employee>> sortEmpbyDepID =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId));
		 * //to group employees based on department
		 * sortEmpbyDepID.entrySet().forEach(entry -> {
		 * System.out.println(entry.getKey() + " --> " + entry.getValue()); });
		 * 
		 * //count employees working in each department Map<Integer, Long>
		 * countEmpByDeptID =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
		 * Collectors.counting())); 
		 * countEmpByDeptID.entrySet().forEach( entry ->
		 * System.out.println("dept "+entry.getKey() + " --> "+ entry.getValue()));
		 */
        
		/*
		 * //print employee status - active or inactive
		 * //employeeList.stream().collect(Collectors.partitioningBy(Employee::getStatus))
		 * 
		 * 
		 * long activeCount= employeeList.stream().filter(x ->"active".equalsIgnoreCase(x.getStatus())).count(); \
		 * long inactiveCount=employeeList.stream().filter(x ->"inactive".equalsIgnoreCase(x.getStatus())).count();
		 * System.out.println("Total Active Employees "+activeCount);
		 * System.out.println("Total In-Active Employees "+inactiveCount);
		 */
		 
	}
}
