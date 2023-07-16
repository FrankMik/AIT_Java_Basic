import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//      Вводится n - натуральное число. Напишите метод, который получает на вход n и вычисляет
//      n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10
        System.out.println("Calculate of factorial");
        Scanner in = new Scanner(System.in);
        System.out.println("Input natural number");
        int a = in.nextInt();
        int result = sumOfFactorial(a);
        System.out.println("Factorial for " + a + " is: " + result);

    }
    public static int sumOfFactorial (int f){
        int i =1;
        int result = 1;
        while (i <=f){
            result = result * i;
           i++;
        }

        return result;
    }
}
