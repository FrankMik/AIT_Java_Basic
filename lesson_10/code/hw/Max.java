import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
//     Написать метод, определяющий максимум из трех натуральных чисел.
//     Числа вводит пользователь с клавиатуры.
        Scanner num = new Scanner(System.in);
        System.out.println("Determine the maximum number.");

        System.out.println("Input first number: ");
        int a = num.nextInt();

        System.out.println("Input second number: ");
        int b = num.nextInt();

        System.out.println("Input third number: ");
        int c = num.nextInt();

        int max = Math.max(a, Math.max(b,c));
        System.out.println("The maximal number: " + max);
     }
}
