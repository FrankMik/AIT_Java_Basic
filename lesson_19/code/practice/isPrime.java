package practice;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
//   Write a method to determine if a number is prime.
//   A prime number is a number which is divisible only by itself and 1. Examples: 2, 7, 11, 19, 47.

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input integer positive number ");
            int n = scanner.nextInt();
            int p = PrimeNumber(n);
            System.out.println(p);
        }
    }

    public static int PrimeNumber(int arr) {
        boolean isPrime = true;
        int n1 =0;
        System.out.println("n = " + n1);
        for (int i = 2; i < n1 - 1; i++) {
            if (n1 % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number " + n1 + " is prime");
        } else {
            System.out.println("Number " + n1 + " is NOT prime");
        }
        return n1;
    }
}