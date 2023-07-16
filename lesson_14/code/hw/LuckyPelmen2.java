import java.util.Random;

public class LuckyPelmen2 {
//    Задача про поиск "счастливого пельменя", часть 2.
//    Хозяйка налепила для гостей 30 пельменей.
//    В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
//    Напишите программу, которая ищет счастливый пельмень.
    public static void main(String[] args) {
        int pelmenNum = 30;
        int a = 25;
        int b = 35;
        int addedWeight = 15;

        int[] weight = new int[pelmenNum];

        Random weight1 = new Random();

        for (int i = 0; i < pelmenNum; i++) {
            weight[i] = weight1.nextInt(b - a + 1) + a;

        }

        int weightLucky = weight1.nextInt(pelmenNum);
        weight[weightLucky] = weight[weightLucky] + addedWeight;

        for (int i = 0; i < pelmenNum; i++) {
            System.out.println("Weight of pelmen " + i + ": " + weight[i] + " grams");
            System.out.println();


        }


        System.out.println();

        System.out.println("Lucky pelmen found at index " + weightLucky);



        System.out.println("Weight of the lucky pelmen: " + weight[weightLucky] + " grams");
    }
}