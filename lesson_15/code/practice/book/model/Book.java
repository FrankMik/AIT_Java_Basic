package practice.book.model;

public class Book {
    // поля класса
    public String title;   //     title
    public String author; //     author
    public int year;     //     year
    public long isbn;   //     ISBN - уникальный номер книги

    // методы класса
    // конструктор


    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);

    }

    // Getters and Setters

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
        if (!(year < 1900 || year > 2023)) {
            this.year = -1;

        } else {
            this.year = year;
        }
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
