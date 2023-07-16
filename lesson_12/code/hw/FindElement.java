public class FindElement {
    public static void main(String[] args) {
//      Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//      Найдите максимальный элемент массива и его индекс.
        int [] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int max = numbers[0];
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;

            }

        }
        System.out.println("Max = " + max + " Index of max = " + index);
    }
}
