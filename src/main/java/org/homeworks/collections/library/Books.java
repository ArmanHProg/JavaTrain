package org.homeworks.collections.library;

public class Books {
    private String title;
    private String author;
    private String publisher;

    private int yearOfPublishing;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Books(String title, String author, String publisher, int yearOfPublishing) {
        super();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Books [title` " + title + ", author` " + author + ", publisher` " + publisher + ", year` " + yearOfPublishing + "]";
    }
}
