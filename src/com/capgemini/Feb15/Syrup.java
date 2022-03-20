package com.capgemini.Feb15;

public class Syrup extends Medicine {

	public Syrup(double price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Store in a dry place.");
	}

}
