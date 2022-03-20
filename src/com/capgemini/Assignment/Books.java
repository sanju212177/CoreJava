package com.capgemini.Assignment;

public class Books extends WrittenItem {

	public Books(int uniqueId, String title, int copies, String author) {
		super(uniqueId, title, copies, author);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void checkIn() {
        System.out.println("Book Checked In");
    }

    @Override
    public void checkOut() {
        System.out.println("Book Checked Out");
    }

    @Override
    public void addItem() {
        System.out.println("Book Added");
        setCopies(getCopies()+1);
    }

    @Override
    public void print() {
        System.out.println("Book id: "+getUniqueId());
        System.out.println("Book title: "+getTitle());
        System.out.println("Number of copies: "+getCopies());
        System.out.println("Book author: "+getAuthor());
    }
}
