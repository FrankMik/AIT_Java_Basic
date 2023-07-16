import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
//     Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
//     Через сколько лет его долг превысит s тысяч рублей,
//     если за это время он не будет отдавать долг.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum of loan");
        double sum = scanner.nextDouble();

        System.out.println("Enter final amount");
        double am = scanner.nextDouble();
        double lo = 1;

        while (sum<am){
            sum = sum + sum *0.1;
            System.out.println(sum);
            lo = lo + 1;
        }
        System.out.println("Debit will exceed " + am + " in " + lo + " years.");
    }
}
