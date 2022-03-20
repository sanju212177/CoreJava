package com.capgemini.oops;

public class TestEngineeringBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineeringBook engbook = new EngineeringBook(111,"abcd","wxyz",5000,"ece");
		if(engbook.isValidation()) {
			System.out.println(engbook);
		}
		

	}

}
