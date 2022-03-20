package com.capgemini.corejava;

import java.util.Scanner;

public class practice_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter arr");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		double avg;
		for(int i=0;i<5;i++) {
			sum += arr[i];
			}
		avg = sum/5.0;
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		int cnt=0;
		for(int i=0;i<5;i++) {
			if(arr[i] < avg) {
				cnt++;
			}
		}
		System.out.println("number of element less than average:"+cnt);
	}
}
