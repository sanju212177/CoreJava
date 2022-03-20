package com.capgemini.Feb11;

import java.util.*;

public class Exception2 {
	
	public static void process(int age)throws AgeInvalidException{
		if(age<15) {
			throw new AgeInvalidException("You are not eligible.");
		}
		else
			System.out.println("You are eligible");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		try {
			process(age);
		}
		catch(AgeInvalidException e){
			System.out.println(e.getMessage());
		}

	}

}
