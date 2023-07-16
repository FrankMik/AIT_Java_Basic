import java.util.Scanner;

public class MainHW {
    public static void main(String[] args) {
        //Вычислите гипотенузу по двум катетам. Длину катетов запросите у пользователя.
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Укажите длинну  первого катета: ");
        double k1 = scanner.nextDouble();

        System.out.println("Укажите длинну  второго катета: ");
        double k2 = scanner.nextDouble();

        double kA = k1 * k1;
        double kB = k2 * k2;

        double kC = kA + kB;

        double k3 = Math.sqrt(kC);
        System.out.println("Длинна гипотенузы равна: " + k3);
_______________________________________________________________

        //Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия.
        // Формула для перевода С = 5*(F-32)/9.
        // Запросить у пользователя темпаратуру.
        System.out.println("Укажите количество градусов по Фаренгейту: ");

        double f = scanner.nextDouble();

        double c = 5*(f-32)/9;

        System.out.printf("Количество градусов по Цельсию: %.2f", c);

 ______________________________________________________________
        */
     // Вычислите площадь треугольника по формуле Герона: p = (a + b + с)/2; S = sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Вычислите площадь треугольника по формуле Герона: ");
        System.out.println("Укажите длинну первой стороны ");
        double a = scanner.nextDouble();

        System.out.println("Укажите длинну второй стороны ");
        double b = scanner.nextDouble();

        System.out.println("Укажите длинну третьей стороны ");
        double c = scanner.nextDouble();

        double p = (a + b + c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника по формуле Герона равна: " + s);

    }
}



