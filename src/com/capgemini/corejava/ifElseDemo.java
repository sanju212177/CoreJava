package com.capgemini.corejava;

import java.util.Scanner;

public class ifElseDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		if(num%2==0) {
			System.out.println(num + " is a even number.");
		}
		else
			System.out.println(num + " is a odd number.");
	}
}
