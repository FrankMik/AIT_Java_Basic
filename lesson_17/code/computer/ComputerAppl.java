package computer;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer("i5 ", 16, 512, "HP");
        comp1.display();
        Computer comp2 = new Computer("i7", 8, 512, "Asus");
        comp2.display();
        System.out.println();
        Laptop lap1 = new Laptop("i7", 16, 512, "Aser", 14, 2);
        lap1.display();
    }
}
