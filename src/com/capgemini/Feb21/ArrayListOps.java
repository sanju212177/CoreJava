package com.capgemini.Feb21;

import java.util.*;

public class ArrayListOps {
	
	public static ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(0);
		}
		return list;
	}
	
	public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i : list) {
			list1.add(0, i);
		}
		return list1;
	}
	
	public static ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i : list) {
			if(i==m)
				list1.add(n);
			else
				list1.add(i);
		}
		return list1;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = makeArrayListInt(4);
		list.forEach(System.out::println);
		System.out.println("----------------------------");

		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<Integer> reverse = reverseList(list);
		reverse.forEach(System.out::println);
		System.out.println("----------------------------");
		
		List<Integer> change = changeList(reverse,0,9);
		change.forEach(System.out::println);
	}
}
