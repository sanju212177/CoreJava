package com.capgemini.Assignment;

public abstract class Item {
	private int uniqueId;
	private String title;
	private int copies;
	
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [uniqueId=" + uniqueId + ", title=" + title + ", copies=" + copies + "]";
	}
	public Item(int uniqueId, String title, int copies) {
		super();
		this.uniqueId = uniqueId;
		this.title = title;
		this.copies = copies;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (copies != other.copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uniqueId != other.uniqueId)
			return false;
		return true;
	}
	abstract public void checkIn();
    abstract public void checkOut();
    abstract public void addItem();
    abstract public void print();
}
