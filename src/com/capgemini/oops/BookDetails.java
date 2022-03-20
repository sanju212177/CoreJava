package com.capgemini.oops;
import java.util.*;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[3];
		int bookno;
		String title;
		String author;
		float price;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter book number :");
			bookno = in.nextInt();
			System.out.println("Enter book title :");
			title = in.next();
			System.out.println("Enter book author :");
			author = in.next();
			System.out.println("Enter book price :");
			price = in.nextFloat();
			book[i] = new Book(bookno,title,author,price);
		}
		System.out.println("Enter book number you want to search");
		int search = in.nextInt();
		boolean check = false;
		for(int i=0;i<3;i++) {
			if(book[i].getBookNo() == search) {
				System.out.println(book[i]);
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("Number not found");
		}
		System.out.println("number of books : " + Book.getBookcount());
	}
	

}
