package hw.xxxBook.controller;

import hw.xxxBook.model.Book;

public class BookAppl {

 //  Создать класс BookAppl в пакете xxx.book с методом main.
 //  В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.
    public static void main(String[] args) {

        Book book1 = new Book(1000000L,"Master and Margaritta", "Bulgakov", 1967);
        Book book2 = new Book(1000001L, "Wij", "Gogol", 1835);
        Book book3 = new Book(1000002L, "Crime and Punishment","Doistoevskij", 1866);

        book1.display();
        book2.display();
        book3.display();
    }
}
