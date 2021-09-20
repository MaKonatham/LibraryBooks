package com.galvanize.tmo.paspringstarter.Model;

public class Book {
    private Long id;
    private String author;
    private String title;
    private String yearOfPublished;

    public Book() {

    }

    public Book(Long id, String author, String title, String yearOfPublished) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearOfPublished = yearOfPublished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(String yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }
}
