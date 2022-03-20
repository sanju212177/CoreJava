package com.capgemini.Feb15;

public class Ointment extends Medicine {

	public Ointment(double price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("For external use only.");
	}

}
