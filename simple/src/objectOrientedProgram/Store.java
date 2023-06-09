package objectOrientedProgram;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        Book book1 = new Book("C language ", "deepak", "123456");
        Book book2 = new Book("Core java", "santosh", "132165");

        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        System.out.println("List of book is : ");
        for (Book book : bookCollection) {
            System.out.println("Book Name : " + book.getTitle() + " By  :" + book.getAuthor() +
                    "  BookNumber : " + book.getbookNumber());
        }
        System.out.println(" ");
        Book.remove_Book(book1);
        System.out.println("After removing the book the book list is ");
        for (Book book : bookCollection) {
            System.out.println("Book Name : " + book.getTitle() + " By  :" + book.getAuthor() +
                    "  BookNumber : " + book.getbookNumber());
        }
    }
}
