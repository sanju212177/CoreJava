package com.capgemini.corejava;
import java.util.*;

public class practice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter array");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		int n = Integer.parseInt(args[0]);
		System.out.println("Output:");
		for(int i=0;i<5;i++) {
			if(arr[i] <= n && arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
