import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        System.out.println("длинна прямоугольника: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        System.out.println("длинна ровна: " + num1 );
        int n1 = Integer.parseInt(num1);
        System.out.println("ширина прямоугольника: ");
        String num2 = br.readLine();
        System.out.println("ширина ровна: " + num2 );
        int n2 = Integer.parseInt(num2);
        System.out.println("площадь прямоугольника ровна: " + " длинна прямоугольника " + n1 + " умноженная на " + " ширину прямоугольника " + n2);
        System.out.println(n1 * n2);

    }
}