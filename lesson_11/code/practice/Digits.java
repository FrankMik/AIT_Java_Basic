import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Methods practice ");

        System.out.println("Input integer positive number: ");
        int num = scanner.nextInt();
        int digits = numberOfDigits(num);
        System.out.println("Number of digits is: " + digits);

        int sumDigits = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sumDigits);
    }

        public static int numberOfDigits (int n) {
            int count = 1;
            while (n/10>0){
                count++;
                n = n/10;
            }
           return count;
        }

       public static int sumOfDigits (int n) {
           int sum =0;
           while (n*10 /10>0) {
               sum = sum + n % 10;
               n = n / 10;
           }
           return sum;
        }

}
