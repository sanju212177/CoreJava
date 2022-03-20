package com.capgemini.Feb11;

import java.util.Scanner;

public class TestEmployeeException {
	
	public static void check(String name,int sal)throws EmployeeException{
		if(sal<3000) {
			throw new EmployeeException("Invalid salary");
		}
		else {
			System.out.println(name+" has "+sal+" salary");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name of employee");
		String empname = in.next();
		System.out.println("Enter salary of employee");
		int salary = in.nextInt();
		try {
			check(empname,salary);
		}
		catch(EmployeeException e){
			System.out.println(e.getMessage());
		}
	}
}
