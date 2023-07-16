import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//      Вводится положительное целое число, найдите сумму его цифр.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Put an integer: ");
        int i = scanner.nextInt();
        int c = 0;
        int s = i;

        while ( s > 0) {

           c += (s % 10);
           s= s/10;


        }
        System.out.println("Sum of number is: " + c);

    }
}