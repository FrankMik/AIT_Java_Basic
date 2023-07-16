import java.util.Scanner;

public class NumberRevers {
    public static void main(String[] args) {
//       Пользователь вводит натуральное число.
//       Распечатайте это число в обратном порядке
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer positive number");
        int n = sc.nextInt();
        int digits = 0;
        int nd = n;
// вычисляем длинну массива
        while (n>0) {
            digits++;
            n = n/10;

        }
        System.out.println(digits);

        int[] digit = new int[digits]; //задаем массив длинной сколько есть цифр в числе
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10;
            nd = nd / 10;
        }

        printArray(digit);
        System.out.println();
        printArrayRevers(digit);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }
    }
    public static void printArrayRevers(int[] arr) {
        for (int i = arr.length -1; i >=0; i--) {
            System.out.print(arr[i] + " | ");

        }
    }
}
