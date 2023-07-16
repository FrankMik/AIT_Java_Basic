public class FindElementIn {
    public static void main(String[] args) {
//       Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//       Найдите минимальный элемент массива и его индекс.
        int[] numbers = { 75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int min = numbers[0];
        int pointer = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                pointer = i;
            }

        }
        System.out.println("Min = " + min + " Index of min = " + pointer);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " | ");
        }
    }
}
