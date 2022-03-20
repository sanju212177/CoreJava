package com.capgemini.Feb16;
import java.util.*;

public class Chararray {
	
	public static HashMap<Character,Integer> getCount(char[] ch){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			hm.putIfAbsent(ch[i], 0);
			hm.put(ch[i], hm.get(ch[i])+1);
		}
		
		return hm;
	}
	
	public static void main(String[] args) {
		char[] c = new char[10];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			c[i] = in.next().charAt(0);
		}
		HashMap<Character, Integer> count = getCount(c);
		count.entrySet().forEach(System.out::println);
		
	}
}
