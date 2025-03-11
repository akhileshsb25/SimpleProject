package com.model;

public class Book {
    private String title;
    private String author;

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // toString() method to provide string representation of the object
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
