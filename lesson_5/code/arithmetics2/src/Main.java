import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи и вычесления");

       // Написать программу для вычисления средней стомости поездки по транспортному проездному.
        //Попросить пользователя ввести стоимость проездного на месяц и количество рабочих дней в месяце.
        //Считая, что в рабочий день в среднем две поездки, и 1.5 поездки в выходной, посчитать и округлить общее
        // число поездок в месяц и посчитать среднююстоимость одной поездки по проездному.
        Scanner scanner = new Scanner(System.in); // включаем Scanner

        System.out.println("Input cost of City ticket: ");
        double priceMonatTicket = scanner.nextDouble(); // считываем от пользователя
        System.out.println("Input number of working das in current month: ");
        int workingDays = scanner.nextInt();

        int trip = workingDays * 2;
        int holidays = 31 - workingDays;

        int holidayTrip = (int)Math.round (1.5 * holidays);

        int trips = 0;
        trips = trip + holidayTrip;

        System.out.println("Number of trips in May: " + trips);

        double averageTripCost = priceMonatTicket/trips;

        System.out.printf("Average price = %.2f", + averageTripCost);

    }
}
 /*      System.out.println("Вычисление угла треугольника по двум другим");
         System.out.println("input 1st angle "); // введите первый угол
         int a1 = scanner.nextInt();

         System.out.println("input 2nd angle "); // введите второй угол
         int a2 = scanner.nextInt();

         int a3 = 180 - a1 - a2;
_______________________
         System.out.println("3rd angle in triangle is: " + a3);
 System.out.println("Calculate length and area of circle.");
        System.out.println("Input radius of circle: ");
        double radius = scanner.nextDouble();

        double l = 2 * Math.PI * radius;
        double s = Math.PI * radius * radius;
        double s1 = Math.PI * Math.pow(radius, 2);

        System.out.println("Length of circle: " + l);
        System.out.println("Area of circle: " + s);
        System.out.println("Area of circle: " + s1);
  */