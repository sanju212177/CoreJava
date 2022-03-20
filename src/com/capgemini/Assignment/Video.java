package com.capgemini.Assignment;

public class Video extends MediaItem {
	String director;
    String genre;
    int yearReleased;

    public Video(int uniqueId, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(uniqueId, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public void checkIn() {
        System.out.println("Video Checked In");
    }

    @Override
    public void checkOut() {
        System.out.println("Video Checked Out");
    }

    @Override
    public void addItem() {
        System.out.println("Video Added");
        setCopies(getCopies()+1);
    }

    @Override
    public void print() {
        System.out.println("Video id: "+getUniqueId());
        System.out.println("Video title: "+getTitle());
        System.out.println("Number of copies: "+getCopies());
        System.out.println("Video runtime: "+getRuntime());
        System.out.println("Video director: "+getDirector());
        System.out.println("Video genre: "+getGenre());
        System.out.println("Video year released: "+getYearReleased());
    }
}
