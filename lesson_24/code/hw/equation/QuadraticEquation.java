package hw.equation;

   // import java.util.Scanner;

    public class QuadraticEquation {
//   To issue the solution of a quadratic equation as a class with the necessary methods,
//   in the solution to use wrapper class variables, do the necessary tests.


        //      public static void main(String[] args) {
        /*    Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение a: ");
            Double a = scanner.nextDouble();
            System.out.println("Введите значение b: ");
            Double b = scanner.nextDouble();
            System.out.println("Введите значение c: ");
            Double c = scanner.nextDouble();
         */
        Double a;
        Double b;
        Double c;

        public double Equation(Double a, Double b, Double c) {

            Double d = b * b - 4 * a * c;
            Double r = null;

            if (d < 0) {
                System.out.println("No roots.");

            } else {
                r = (-b + Math.sqrt(d)) / (2 * a);

                System.out.println("Root: r = " + r);
            }
            return r;
        }

        public double Equation2(Double a, Double b, Double c) {
            Double d = b * b - 4 * a * c;
            Double r2 = null;

            if (d < 0) {
                System.out.println("No roots.");

            } else {
                r2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Root: r2 = " + r2);
            }

            return r2;
        }
    }