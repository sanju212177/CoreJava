package com.capgemini.oops;

public class OppoMobile extends MobilePhones implements Latest4gExtender {

	public OppoMobile(String brand, int ram, int internalStorage, int price) {
		super(brand, ram, internalStorage, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printMobileDetails() {
		// TODO Auto-generated method stub
		System.out.println("Brand="+getBrand());
		System.out.println("RAM="+getRam());
		System.out.println("Internal Storage="+getInternalStorage());
		System.out.println("Price="+getPrice());
		latest4gExtender();
		System.out.println("\n----------------------------------------\n");
	}

	@Override
	public void latest4gExtender() {
		// TODO Auto-generated method stub
		System.out.println("Latest 4G Enabled.");
	}
	

}
