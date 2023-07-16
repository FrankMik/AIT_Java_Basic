public class Production {
    public static void main(String[] args) {
//    Написать метод, принимающий массив целых чисел,
//    и возвращающий произведение всех его элементов,
//    с четными индексами.
//    0 - тоже четное число.
        int[] prod = new int[100];
        int a = 0, b = 100;

        for (int i = 0; i < prod.length; i++) {
            prod[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(prod[i] + " | ");
        }
        System.out.println();
        evenNumbers(prod);
        System.out.println();
    }

    public static int evenNumbers(int[] number){
        int even = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                even *= number[i];
            }
        }
        System.out.println("The multiplication all even numbers is: " + even);
        return even;
    }

}
