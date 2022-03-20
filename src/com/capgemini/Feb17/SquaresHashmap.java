package com.capgemini.Feb17;
import java.util.*;

public class SquaresHashmap {
	
	public static HashMap<Integer,Integer> getSquares(List<Integer> list){
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(Integer n : list) {
			hm.put(n, n*n);
		}
		return hm;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(9);
		list.add(7);
		list.add(3);
		
		HashMap<Integer,Integer> square = getSquares(list);
		square.entrySet().forEach(System.out::println);
		
	}
	
}
