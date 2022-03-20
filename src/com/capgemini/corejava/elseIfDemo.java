package com.capgemini.corejava;

import java.util.Scanner;

public class elseIfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = in.nextInt();
		String grade = null;
		System.out.println("Marks : " + marks);
		if(marks>75)
			grade = "Distinction";
		else if(marks>60)
			grade = "First";
		else if(marks>45)
			grade = "Second";
		else if(marks>33)
			grade = "Third";
		else
			grade = "Fail";
		System.out.println("Grade : " + grade);
	}
}
