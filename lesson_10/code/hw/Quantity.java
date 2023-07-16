import java.util.Scanner;

public class Quantity {
    public static void main(String[] args) {
 //      С клавиатуры вводятся N чисел.
 //      Составьте программу, которая определяет кол-во отрицательных,
//       кол-во положительных и кол-во нулей среди введеных чисел.
//       Значение N вводится с клавиатуры.
        System.out.println("Input positive and negative numbers ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many of numbers input you? ");
        int f = scanner.nextInt();


        int n = 0;
        int p = 0;
        int z = 0;
        System.out.println("Input numbers: ");

        int r = 0;
        while (r < f) {
            int num = scanner.nextInt();
            if (num > 0) {
                p++;
            } else if (num < 0) {
                n++;
            } else {
                z++;
            }
            r++;
        }
        System.out.println("Positives: " + p);
        System.out.println("Negatives: " + n);
        System.out.println("Zeros: " + z);
    }
}
