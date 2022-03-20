package com.capgemini.oops;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private boolean validation = false;
	private static int bookcount=0;
	
	{
		bookcount++;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isValidation() {
		return validation;
	}
	public static int getBookcount() {
		return bookcount;
	}
	public static void setBookcount(int bookcount) {
		Book.bookcount = bookcount;
	}
	public Book(int bookNo, String title, String author, float price) {
		if(title.length()>=4 && price<5001 && price>0) {
			validation = true;
			System.out.println("Details are Valid");
			this.bookNo = bookNo;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		else {
			bookcount--;
			validation = false;
			System.out.println("Details are not Valid");
		}
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
