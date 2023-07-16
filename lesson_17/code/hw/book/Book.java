package hw.book;

public class Book {
//    Create a Dictionary class that extends the Book class.
//    Suggest a set of fields for it and override the display method.
//    In the BookAppl class, in the main method,
//    create some dictionaries and print information about them to the console.

     // методы класса
     public String title;   //     title
     public String author; //     author
     public int year;     //     year
     public long isbn;   //     ISBN - уникальный номер книги


    // конструктор

    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }
    // конструктор без автора

    public Book(String title, int year, long isbn) {
        this.title = title;
        this.year = year;
        this.isbn = isbn;
    }
    // конструктор без года

    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    // создаём геттеры и сеттеры

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    // создаём метод display для вывода информации

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);
    }
    public void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);
    }

}
