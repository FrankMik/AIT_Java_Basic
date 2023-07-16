package hw.xxxBook.model;

public class Book {
//   Создать класс Book в пакете xxx.book.model.
//   В этом классе определить поля: private long isbn; private String title; private String author; private int yearOfPublishing;
//   Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора.
//   Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры, исходя из логики и необходимости.
//   Создать метод public void display() для печати в консоль информации о книге.

    private long isbn; // индивидуальный номер

    private String title; // название

    private String author; // писатель

    private int yearOfPublishing; // год выпуска

    // создаём конструктор с инициализацией всех полей

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    // создаём конструктор с отсутствием автора

    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    // создаём геттеры и сеттеры для возможности вызовы данных и их изменения

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    // создаём метод display для вывода информации

    public void display(){
        System.out.println("ISBN: " + isbn + ", Name of book: " + title + ", Author: " + author + ", Year of publishing: " + yearOfPublishing);
    }
}
