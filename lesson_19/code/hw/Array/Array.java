package hw.Array;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
//   Вводится пользователем натуральное число n.
//   Сформировать массив из всех делителей данного числа.
        Scanner num = new Scanner(System.in);
        System.out.println("Input natural number");
        int n = num.nextInt();
        int[] natur = new int[1000];
        int s = 0;
        int naturNum;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
              naturNum = i;
              natur[s] = naturNum;
              s++;
            }
        }
        for (int i = 0; i < s-1; i++) {
            System.out.println(natur[i]);
        }
    }
}
