package com.api.book.bootrestbook.entities;

public class Book {


    private int id;
    private String author;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Book(String author, int id, String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }

    public Book(){
    }

}

