package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("J. K. Rowling", 1965, "British author of the Harry Potter series");
        BookAuthor author2 = new BookAuthor("George R. R. Martin", 1948, "American novelist and short story writer");
        BookAuthor author3 = new BookAuthor("Nguyễn Nhật Ánh", 1955, "Vietnamese writer of children's literature");

        List<BookAuthor> authorsBook1 = new ArrayList<>();
        authorsBook1.add(author1);
        authorsBook1.add(author2);

        List<BookAuthor> authorsBook2 = new ArrayList<>();
        authorsBook2.add(author3);

        Book book1 = new Book("Fantasy Worlds", "Fantasy", 199000f, 350, authorsBook1);
        Book book2 = new Book("Tuổi thơ dữ dội", "Novel", 150_000f, 280, authorsBook2);

        System.out.println(book1);
        System.out.println(book2);

        for (BookAuthor author : book1.getAuthors()) System.out.println(author);
    }
}
