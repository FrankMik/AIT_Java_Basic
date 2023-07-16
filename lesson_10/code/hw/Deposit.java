import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
//        В сберкассу на трёхпроцентный вклад положили S рублей.
//        Какой станет сумма вклада через N лет?
        System.out.println("Input the amount of money: ");
        Scanner scanner = new Scanner(System.in);
        double am = scanner.nextDouble();

        System.out.println("For how long? ");
        double lo = scanner.nextDouble();
        double year = am;

        while (lo>=0) {
           year = year * 0.03;
           // System.out.println(year);
            am = am + year;
            lo--;

        }
        System.out.println("Amount will be: " + am);
    }
}
