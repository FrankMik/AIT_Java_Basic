import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your firstname? ");
        String name = br.readLine();
        System.out.println("What is your lastname? ");
        String name1 = br.readLine();
        System.out.println("How old are you?");
        String num1 = br.readLine();
        int n1 = Integer.parseInt(num1);
        System.out.println("Where do you live?");
        String address = br.readLine();
        System.out.println("nice to meet you");
    }
}