package com.capgemini.corejava;
import java.util.*;

public class cube_of_digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0,m = n;
		while(m!=0) {
			sum += Math.pow(m%10, 3);
			m=m/10;
		}
		System.out.println("sum of the cube of the digits of " + n + " is : " + sum);
	}
}
