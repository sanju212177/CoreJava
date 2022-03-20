package com.capgemini.corejava;

import java.util.Scanner;

public class primeNumber {
	
	public static boolean checkPrime(int num) {
		for(int i=3;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<2) {
			System.out.println("Invalid Input");
		}
		else if(n==2) {
			System.out.println("Output : ");
			System.out.println(2);//for 2
		}
		else {
			System.out.println("Output : ");
			System.out.println(2);
			for(int i=3;i<=n;i+=2) {//only odd values
				boolean check = checkPrime(i); 
				if(check) {
					System.out.println(i);
				}
			}
		}
	}

}
