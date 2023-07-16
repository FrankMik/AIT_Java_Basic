package hw.array;

public class ArrayOfInteger {
//  Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
//  Найдите среднюю величину по всем элементам массива с четными индексами.
    public static void main(String[] args) {
        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        int sum = 0;
        double sum1 = 0;


        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                sum = sum + array[i];
                sum1++;

            }
        }
        double average = sum/sum1;
        System.out.println("Average value of all numbers with even elements is: " + average);

    }

}
