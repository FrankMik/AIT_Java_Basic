package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        // find number of numbers, version 2
        System.out.println("========Digits in number========");
      Integer x = 1000;
      String st = x.toString();
        System.out.println("Number of digits in " + x + " are " + st.length());

      Double y = 32456.78;
      String st1 = y.toString();
        System.out.println("Number of digits in " + y + " are " + st1.length());

        // assignment and calculation
        System.out.println("========Calculation========");
        int n = 20;
        Integer z = 10;
        System.out.println(n);
        System.out.println(z);
        z = z + 100;
        System.out.println(z);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);
        System.out.printf("%.2f",circleLength);

        // Methods with constants classes
        System.out.println("========Constants of Wrapper classes========");
        System.out.println("Integer max: " + Integer.MAX_VALUE);
        System.out.println("Integer min: " + Integer.MIN_VALUE);
        System.out.println("Long max: " + Long.MAX_VALUE);
        System.out.println("Long min: " + Long.MIN_VALUE);
        System.out.println("Double max: " + Double.MAX_VALUE);
        System.out.println("Double min: " + Double.MIN_VALUE);

        // auf 0 teilen
        System.out.println("========Not-a-Number (NaN)========");
        double a = 20.0/0;
        if (Double.isInfinite(a) || Double.isNaN(a)){
            System.out.println("Wrong operation or wrong result.");
        }else {
            System.out.println(a);
        }

        // Converting a string to a number
        String str1 = "987654";
        int num = Integer.parseInt(str1);
        System.out.println(num);
        String str2 = "2.7118281828";
        double exp = Double.parseDouble(str2);
        System.out.println(exp);
    }
}
