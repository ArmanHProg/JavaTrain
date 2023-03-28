package org.homeworks.collections.library;

public class Library {
    private String name;

    private Books book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }


    public String getTitle() {
        return book.getTitle();
    }

    public String getAuthor() {
        return book.getAuthor();
    }



    public Library(String name, Books book) {
        this.name = name;
        this.book = book;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Library` " +  name + ",  " + book;
    }
}
