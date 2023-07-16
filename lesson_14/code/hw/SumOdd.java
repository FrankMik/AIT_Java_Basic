public class SumOdd {
    public static void main(String[] args) {
//    изменить код задач про:
//    сумма нечетных чисел в массиве
//    чтобы использовались операторы break или continue.
        int[] random = new int[10];
        int a = 1, b = 10;

        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(random[i] + " | ");

        }
        System.out.println();
        oddNumbers(random);
    }
    public static int oddNumbers (int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum = sum + numbers[i];
                continue;
            }
        }
        System.out.println("The sum of all odd digits is: " + sum);
        return sum;
    }
}
