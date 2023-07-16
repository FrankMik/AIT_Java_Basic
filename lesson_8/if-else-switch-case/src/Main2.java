import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Parsing IP-address");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input IP-address");
        String ipAddress = scanner.nextLine();

        ipAddress = ipAddress.trim();

        int l = ipAddress.length();

        int firstDotIndex = ipAddress.indexOf('.');
        System.out.println(firstDotIndex);
        int secondDotIndex = ipAddress.indexOf('.',firstDotIndex + 1);
        System.out.println(secondDotIndex);
        int thirdDotIndex = ipAddress.indexOf('.',  secondDotIndex + 1);
        System.out.println(thirdDotIndex);
        int extraDotIndex = ipAddress.indexOf('.',  thirdDotIndex + 1);
        System.out.println(extraDotIndex);
        if (extraDotIndex != -1) {
            System.out.println("Wrong input, a lot of dots.");
        }
        if (extraDotIndex == -1) {
            String byte1 = ipAddress.substring(0, firstDotIndex);
            int num1 = Integer.parseInt(byte1);

            if (num1 <0 || num1 > 255){
                System.out.println("Wrong format IP-address");
            }
            String byte2 = ipAddress.substring(firstDotIndex + 1, secondDotIndex);
            int num2 = Integer.parseInt(byte2);

            if (num2 <0 || num2 > 255) {
                System.out.println("Wrong format IP-address");
            }
            String byte3 = ipAddress.substring(secondDotIndex + 1, thirdDotIndex);
            int num3 = Integer.parseInt(byte3);

            if (num3 <0 || num3 > 255) {
                System.out.println("Wrong format IP-address");
            }
            String byte4 = ipAddress.substring(thirdDotIndex + 1, l);
            int num4 = Integer.parseInt(byte4);

            if (num4 <0 || num4 > 255) {
                System.out.println("Wrong format IP-address");
            }

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
        }

    }
}