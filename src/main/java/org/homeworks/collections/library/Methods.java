package org.homeworks.collections.library;

import java.util.ArrayList;

public class Methods {

    ArrayList<Library> list = new ArrayList<>();


    /**
     * adding books in library
     *
     * @param nameofLib
     * @param title
     * @param author
     * @param publisher
     * @param yearOfPublishing
     */
    public void add(String nameofLib, String title, String author, String publisher, int yearOfPublishing) {

        Books books = new Books(title, author, publisher, yearOfPublishing);
        Library lib = new Library(nameofLib, books);
        list.add(lib);

    }

    /**
     * display all libs
     */
    public void display() {
        for(int i = 0; i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }

    }

    /**
     * deletes all that's author books
     */
    public void delete(String author) {
        int counter = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAuthor().equals(author)) {
                    list.remove(i);
                    i--;
                    counter ++;
                    System.out.println(" deleted ");
                }
            }
            if (counter == 0) System.out.println("We have not books yet");
        }



    /**
     * searching books in library with title
     *
     * @param title
     */
    public void searchByTitle(String title) {
        for (Library library : list) {
            if (library.getTitle().equals(title)) {
                System.out.println(" We have that book, it`s author : " + library.getAuthor());
            } else System.out.println(" We have not that book ");
        }
    }

    /**
     * searching books in library with author
     *
     * @param author
     */
    public void searchByAuthor(String author) {
        int counter = 0;
        for (Library library : list) {
            if (library.getAuthor().equals(author)) {
                System.out.println(" We have that author`s book it`s title : ( " + library.getTitle() + " )");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("  We have not that book : ");
        }
    }

}



