package com.capgemini.oops;
import java.util.*;

public class OddEvenList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arrlist1.add(in.nextInt());
		}
		for(int i=0;i<n;i++) {
			arrlist2.add(in.nextInt());
		}
		ArrayList<Integer> oddevenlist = generateOddEvenList(arrlist1,arrlist2,n);
		for(int i : oddevenlist)
	        System.out.println(i);
	}

	public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> arrlist1, ArrayList<Integer> arrlist2,int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> oddevenlist = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(i%2==0)
				oddevenlist.add(arrlist1.get(i));
			else
				oddevenlist.add(arrlist2.get(i));
		}
		return oddevenlist;
	}
}
