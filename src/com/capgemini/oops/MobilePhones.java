package com.capgemini.oops;

public abstract class MobilePhones {
	private String brand;
	private int ram;
	private int internalStorage;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getInternalStorage() {
		return internalStorage;
	}
	public void setInternalStorage(int internalStorage) {
		this.internalStorage = internalStorage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public MobilePhones(String brand, int ram, int internalStorage, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.internalStorage = internalStorage;
		this.price = price;
	}
	public abstract void printMobileDetails();
}
