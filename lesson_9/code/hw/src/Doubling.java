import java.util.Scanner;

public class Doubling {
    public static void main(String[] args) {
 //     Программа получает на вход строку и число повторений этой строки
 //     Программа должна вывести эту строку нужное количество раз.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Put the string: ");
        String a = scanner.nextLine();

        System.out.println("Put the number of doubling: ");
        int n = scanner.nextInt();

        int n1 = n;

        while (n1 !=0) {
            System.out.println( a + n1);
            n1--;

        }


    }
}
