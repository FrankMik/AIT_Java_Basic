public class SumMassive {
    public static void main(String[] args) {
//    Написать метод, принимающий массив целых чисел,
//    и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
//    Массив на 100 элементов задать случайными числами в интервале от 1 до 100.
        int[] random = new int[100];
        int a = 1, b = 100;

        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " | ");

        }
        printArray(random);
        System.out.println();
        oddNumbers(random);
    }

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i] + " | ");
        }
    }

    public static int oddNumbers (int[] numbers){
        int sum = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("The sum of all odd digits is: " + sum);
        return sum;
    }
}


