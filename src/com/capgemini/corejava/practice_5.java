package com.capgemini.corejava;
import java.util.*;
public class practice_5 {
	
	public static String reverse(String s) {
		String rev="";
		for(int i= s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		String[] arr = {"abcd","efgh","ijkl","mnop","qrst"};
		for(int i=0;i<5;i++) {
			arr[i] = reverse(arr[i]);
		}
		Arrays.sort(arr);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
