package com.capgemini.Assignment;

public class CD extends MediaItem {
	String artist;
    String genre;

    public CD(int uniqueId, String title, int copies, int runtime, String artist, String genre) {
        super(uniqueId, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void checkIn() {
        System.out.println("CD Checked In");
    }

    @Override
    public void checkOut() {
        System.out.println("CD Checked Out");
    }

    @Override
    public void addItem() {
        System.out.println("CD Added");
        setCopies(getCopies()+1);
    }

    @Override
    public void print() {
        System.out.println("CD id: "+getUniqueId());
        System.out.println("CD title: "+getTitle());
        System.out.println("Number of copies: "+getCopies());
        System.out.println("CD runtime: "+getRuntime());
        System.out.println("CD artist: "+getArtist());
        System.out.println("CD genre: "+getGenre());
    }
}
