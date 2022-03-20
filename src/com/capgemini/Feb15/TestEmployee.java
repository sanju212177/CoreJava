package com.capgemini.Feb15;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Arun",101);
		Employee emp2 = new Employee("Smith",102);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
