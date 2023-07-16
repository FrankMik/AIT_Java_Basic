import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
  //       Составьте программу, которая вычисляет сумму чисел от 1 до N.
  //       Значение N вводится с клавиатуры.

        System.out.println("Sum of numbers less than N");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;


        while ( i < n) {
            sum = sum + i + 1;
            i = i + 1;

        }

        System.out.println("Sum = " + sum);
    }
}
