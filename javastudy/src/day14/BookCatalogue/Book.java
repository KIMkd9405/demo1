package day14.BookCatalogue;

import java.util.Scanner;

public class Book {
    private String bookName;
          private String bookAuthor;
          private int bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Book(String bookName, String bookAuthor, int bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;


    }
}
