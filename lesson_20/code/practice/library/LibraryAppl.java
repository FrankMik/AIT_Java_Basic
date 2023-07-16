package practice.library;

import practice.library.model.Book;
import practice.library.model.Library;

public class LibraryAppl {
    public static void main(String[] args) {

        Library library = new Library(1000);
        library.addBook(new Book("War and peace", "Tolstoj", 1990, 2000000000001L));
        library.addBook(new Book("Anna Karenina", "Tolstoj", 1995, 2000000000012L));
        library.addBook(new Book("1984", "Oruel", 1985, 2000000000023L));

        System.out.println(library.getSize());

        Book bookFinded = library.findBook(2000000000012L);
        System.out.println(bookFinded);
    }
}
