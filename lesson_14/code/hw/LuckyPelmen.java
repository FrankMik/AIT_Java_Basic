public class LuckyPelmen {
    public static void main(String[] args) {
//     Задача про поиск "счастливого пельменя", часть 1.
//     Хозяйка налепила для гостей 30 пельменей,каждый весом от 25 до 35 грамм.
//     Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
        double[] pelmen = new double[30];
        double a = 25, b = 35;

        for (int i = 0; i < pelmen.length; i++) {
          pelmen[i] = (int)(Math.random()* (b-a+1)+a);

            System.out.println("Pelmen weight: " + pelmen[i] + " , ");
        }

    }
}
