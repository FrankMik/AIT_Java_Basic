package hw.book;

public class Dictionary extends Book{

    int quantityOfPages; // переменная с количеством страниц

    public Dictionary(String title, String author, int year, long isbn) {
        super(title, author, year, isbn);
    }

    // конструктор

    public Dictionary(String title, String author, int year, long isbn, int quantityOfPages) {
        super(title, author, year, isbn);
        this.quantityOfPages = quantityOfPages;
    }

   // геттеры и сеттеры

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
    public void displayBook(){
        super.displayBook();
        System.out.println("Quantity of pages: " + quantityOfPages);
    }
}
