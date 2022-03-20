package com.capgemini.corejava;

import java.util.Scanner;

class Calculate2{
	public int calculateDiff(int num1,int num2) {
		int difference;
		if(num1>=num2) {
			difference = num1*num1 - num2*num2;
		}
		else {
			difference = num2*num2 - num1*num1;
		}
		return difference;
	}
}

public class Day2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		Calculate2 obj = new Calculate2();
		int difference = obj.calculateDiff(n1,n2);
		System.out.println(difference);

	}

}
