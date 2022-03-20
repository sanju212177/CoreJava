package com.capgemini.Assignment;

public class JournalPaper extends WrittenItem {
	private int yearPublished;

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public JournalPaper(int uniqueid, String title, int copies, String author, int yearPublished) {
		super(uniqueid, title, copies, author);
		this.yearPublished = yearPublished;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Journal Paper Checked In");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Journal Paper Checked Out");
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Journal Paper Added");
		setCopies(getCopies()+1);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Journal Paper id: "+getUniqueId());
        System.out.println("Journal Paper title: "+getTitle());
        System.out.println("Number of copies: "+getCopies());
        System.out.println("Journal Paper author: "+getAuthor());
	}
	
}
