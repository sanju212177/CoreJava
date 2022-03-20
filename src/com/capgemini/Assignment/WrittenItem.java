package com.capgemini.Assignment;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int uniqueId, String title, int copies, String author) {
		super(uniqueId, title, copies);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
