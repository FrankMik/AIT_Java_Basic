import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
//     Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//     Запросите у пользователя какое-то натуральное число.
//     Определите, есть ли это число в массиве.
//     Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
//     а возвращает ответ - нашлось ли это число в массиве.
        Scanner num = new Scanner(System.in);
        int[] numbers = new int[10];

        int a = 1, b = 100;

        for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int)(Math.random()* (b-a+1)+a);

        }
        printArray(numbers);
        System.out.println();
        System.out.println("Input number for search (integer and positive) ");
        int n = num.nextInt();

        while (n<0){
            System.out.println("Wrong input! Try again");
            n = num.nextInt(); //переспрашиваем ввод числа
        }
        searchInArray(numbers,n);
        if (searchInArray(numbers,n)){
            System.out.println("We find the numbers!" + " Index " + searchIndexArray(numbers, n));
        }else {
            System.out.println("We did`t find the numbers!");
        }

    }
    public static int searchIndexArray(int[]arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static boolean searchInArray(int[]arr, int x){
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
        if (x ==arr[i]){
            res = true;
            return true;
        }
        }
          return false;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
