// Implement a java program to illustrate storing user defined classes in collection

import java.util.ArrayList;

public class Program_3 {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("qwerty", "abc"));
        bookList.add(new Book("qwertyuiop", "xyz"));

        for (Book book : bookList) {
            System.out.println(book.toString());
        }

    }

}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book {" + "title: " + title + "\n" + "author: " + author + "}";
    }

}

