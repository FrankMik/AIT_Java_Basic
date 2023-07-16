package practice.book.controller;

import practice.book.model.Book;

import java.nio.Buffer;

public class BookAppl {
    public static void main(String[] args) {

        // создаём объектные переменные
        Book book1 = new Book("Heart of dragon", "Kiril Klevanski", 2016, 1000000L);
        Book book2 = new Book("Code Da vinci", "Den Brown", 2003, 1000001L);
        Book book3 = new Book("White tusk", "Jack London", 1900, 1000002L);

        book1.display();
        book2.display();
        book3.display();

        Book book4 = new Book("Heart of dragon", "Kiril Klevanski", 2025, 1000030L);
        book4.display();

    }
}
