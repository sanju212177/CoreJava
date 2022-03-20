package com.capgemini.Feb16;

import java.util.*;

public class SortedHashMap {
	
	public static List<String> getValues(Map<Integer, String> hm) {
		List<String> list = new ArrayList<String>();
		
		
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"pqr");
		hm.put(2, "xyz");
		hm.put(3, "abc");
		hm.put(4, "ijk");
		List<String> list = getValues(hm);
		System.out.println("Sorted Values :");
		list.forEach(System.out::println);
		
	}

}
