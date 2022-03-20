package com.capgemini.corejava;

import java.util.Scanner;

class Calculate{
	public int calculateSum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
}

public class Day2Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Calculate obj = new Calculate();
		int sum = obj.calculateSum(n);
		System.out.println(sum);
	}
}
