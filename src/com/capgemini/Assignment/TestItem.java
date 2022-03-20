package com.capgemini.Assignment;

public class TestItem {
	public static void main(String[] args) {
		Books book = new Books(101,"abcd",10,"xyz");
		book.checkIn();
		book.addItem();
		book.addItem();
		book.checkOut();
		book.print();
		System.out.println("\n------------------------------------\n");
		
		JournalPaper jp = new JournalPaper(201,"efgh",15,"pqrs",2022);
		jp.checkIn();
		jp.checkOut();
		jp.print();
		System.out.println("\n------------------------------------\n");
		
		Video video = new Video(301,"ijkl",150,200,"directorXX","genreXX",2021);
		video.checkIn();
		video.addItem();
		video.checkOut();
		video.print();
		System.out.println("\n------------------------------------\n");
		
		CD cd = new CD(401,"asdf",100,400,"artistXX","genreXX");
		cd.checkIn();
		cd.addItem();
		cd.addItem();
		cd.addItem();
		cd.checkOut();
		cd.print();
		System.out.println("\n------------------------------------\n");
		
	}
}
