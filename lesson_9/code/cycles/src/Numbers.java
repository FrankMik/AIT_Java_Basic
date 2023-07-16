import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
//        Пользователь вводит натуральное число (целое, положительное).
//        Выясните, сколько цифр в числе.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int n = scanner.nextInt();

        int count = 0;
        int div = n;

        while ( div >0 ) {
            count++;
            div = div / 10;

        }
        System.out.println("Number of digits is: " + count);

    }
}
