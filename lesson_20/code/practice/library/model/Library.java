package practice.library.model;

public class Library {
    private Book[] books;
    private int size;

    // метод класса который задаёт размер бибдиотеки (размер массива)
    public Library(int capacity) {
        books = new Book[capacity];
    }

    // добавление книги
    public boolean addBook(Book book) {
        if ((size == books.length) || findBook(book.getIsbn()) != null) {
            return false;// не можем добавить книгу, или такая уже есть
        }
        books[size] = book;
        size++;
        return true;
    }

    // метод поиска книги по ISBN
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {   // пробегаем по массиву
            if (books[i].getIsbn() == isbn) {  // проверяем совпадение ISBN
                return books[i];   //возвращаем элемент массива
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    //  удаление книги
    public Book removeBook(long isbn, Book[] books ){
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                victim = books[i];
                books[i] = books[size - 1]; // на место удаляемой ставим последнюю книжку
                books[size - 1] = null; // последнюю книгу стираем, тк она теперь стоит на месте удаленной
                size--;
                break;
            }
        }
        return victim;
    }
}
