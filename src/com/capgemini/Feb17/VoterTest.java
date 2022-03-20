package com.capgemini.Feb17;

import java.util.*;
import java.util.Map.Entry;

public class VoterTest {
	
	public static List<Integer> votersList(Map<Integer, Integer> hm) {
		List<Integer> list = new ArrayList<Integer>();
		for(Entry<Integer, Integer> age : hm.entrySet()) {
			if(age.getValue()>=18)
				list.add(age.getKey());
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(108, 43);
		hm.put(103, 15);
		hm.put(112, 19);
		hm.put(142, 17);
		hm.put(123, 32);
		hm.put(105, 65);
		List<Integer> eligible = votersList(hm);
		eligible.forEach(System.out::println);
	}
}
