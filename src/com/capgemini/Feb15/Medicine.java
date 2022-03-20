package com.capgemini.Feb15;

public abstract class Medicine {
	private double price;
	private String expiryDate;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Medicine(double price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	
	public void getDetails() {
		System.out.println("Price = "+price);
		System.out.println("Expiry Date = "+expiryDate);
		System.out.println("\n----------------------------\n");
	}
	
	public abstract void displayLabel();
}
