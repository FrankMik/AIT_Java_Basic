package hw.book;

public class BookAppl {
    public static void main(String[] args) {

    Dictionary book1 = new Dictionary("Vocabulary", "Duden", 1996, 1000000L, 650);
    Dictionary book2 = new Dictionary("Lexicon", "Wahrig", 1978,1000001L, 839);
    book1.displayBook();
        System.out.println();
    book2.displayBook();
    }
}
