package com.capgemini.corejava;

import java.util.Scanner;

public class Fibonacci {
	
	public static int recursive(int num) {
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		return (recursive(num-1)+recursive(num-2));
	}
	
	public static int nonRecursive(int num) {
		int a=1,b=1,sum=0;
		if(num==1 || num==2) {
			return 1;
		}
		else {
			for(int i=3;i<=num;i++) {
				sum=a+b;
				a=b;
				b=sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,a=1,b=1,sum;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of fibonacci series");
		num = in.nextInt();
		System.out.println("Enter your choice:");
		System.out.println("Press 1 for recursive method");
		System.out.println("Press 2 for non recursive method");
		int ch = in.nextInt();
		switch(ch) {
			case 1:
				int recursivefib = recursive(num);
				System.out.println("nth digit of fibonacci sequence is : " + recursivefib);
				break;
			case 2:
				int nonrecursivefib = nonRecursive(num);
				System.out.println("nth digit of fibonacci sequence is : " + nonrecursivefib);
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

}
