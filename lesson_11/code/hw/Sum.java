import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
//        Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10
//        Для вычисления sum используйте метод.
        System.out.println("Calculate the sum.");
        Scanner db = new Scanner(System.in);
        System.out.println("Input the number: ");
        double n = db.nextDouble();
        double sum = sumOfDigits(n);
        System.out.println("Sum of numbers: " + sum);
    }
    public static double sumOfDigits(double c) {
        double i = 1;
        double sum =0;
        while (i<=c){
          sum = sum + (1.0/i);
          i++;

        }
        return sum;
    }

}
