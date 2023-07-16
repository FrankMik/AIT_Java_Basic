import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Superman and his choice");

        Scanner scanner = new Scanner(System.in);

        System.out.println("left - loose your horse, right - loose your honor, forward - loose your head");
        System.out.println("What is your choice?");
        String choice = scanner.next();

        if (choice.equals("left")) {
            System.out.println("You loose your horse!");
        } else if (choice.equals("right")) {
            System.out.println("You loose your honor!");
        } else if (choice.equals("forward")) {
            System.out.println("You loose your head!");
        } else {
            System.out.println("Wrong input!");
        }

    }
}