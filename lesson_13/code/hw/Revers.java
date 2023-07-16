import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
//     Пользователь вводит строку.
//     Распечатайте эту строку в обратном порядке.
        Scanner str = new Scanner(System.in);
        System.out.println("Input the desired string");
        String rev = str.nextLine();

        char[] string = rev.toCharArray();

            for (int i = rev.length() -1; i >=0; i--) {
                System.out.print(string[i]);

            }
    }

}
