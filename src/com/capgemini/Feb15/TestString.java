package com.capgemini.Feb15;


public class TestString {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "xyz";
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		s1.append("pqrs");
		s2.append("ijkl");
		System.out.println(s1.append(s2));
		System.out.println(s1);
		
	}
}
