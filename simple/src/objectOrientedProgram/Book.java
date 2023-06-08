package objectOrientedProgram;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String bookNumber;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public Book(String title, String author, String bookNumber) {
        this.title = title;
        this.author = author;
        this.bookNumber = bookNumber;
    }

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

    public String getbookNumber() {
        return bookNumber;
    }

    public void setbookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public static void add_Book(Book book) {
        bookCollection.add(book);
    }

    public static void remove_Book(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}