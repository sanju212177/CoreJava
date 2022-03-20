package com.capgemini.corejava;

import java.util.Scanner;

public class practice_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter array");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		boolean check = true;
		for(int i=0;i<5;i++) {
			if(arr[i] == Integer.parseInt(args[0])) {
				System.out.println("BINGO");
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println("Not Found");
		}
	}
}
