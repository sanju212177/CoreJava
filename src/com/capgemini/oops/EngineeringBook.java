package com.capgemini.oops;

public class EngineeringBook extends Book {
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		if(super.isValidation()) {
			this.category = category;
		}
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "EngineeringBook [category=" + category + "]";
	}
	
}
