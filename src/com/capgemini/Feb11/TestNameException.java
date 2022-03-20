package com.capgemini.Feb11;
import java.util.*;

public class TestNameException {
	
	public static void process(String firstName,String middleName,String lastName)throws NameException {
		if(firstName.length()<1) {
			throw new NameException("First name not provided");
		}
		else if(lastName.length()<1) {
			throw new NameException("Last name not provided");
		}
		else {
			System.out.println(firstName+" "+middleName+" "+lastName);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//String firstName = in.next();
		String middleName = in.next();
		String lastName = in.next();
		try {
			process("",middleName,lastName);
		}
		catch(NameException e) {
			System.out.println(e.getMessage());
		}
	}
}
