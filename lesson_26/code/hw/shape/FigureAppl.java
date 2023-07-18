package hw.shape;

import practice.Employee;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[4];
        figure[0] = new Circle(12);
        figure[1] = new Circle(7.5);
        figure[2] = new Triangle(3.5);
        figure[3] = new Square(4.5);

        printArray(figure);

        double totalArea = totalArea(figure);
        System.out.println("Total area = " + totalArea);

        double totalPerimeter = totalPerimeter(figure);
        System.out.println("Total perimeter = " + totalPerimeter);
    }

    public static double totalPerimeter(Shape[] figure){
        double sum1 = 0;
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] != null){
                sum1+= figure[i].calcPerimeter();
            }
        }
        return sum1;
    }
    public static double totalArea(Shape[] figure){
        double sum = 0;
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] != null){
                sum+= figure[i].calcArea();
            }
        }
        return sum;
    }
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.println(arr[i]);
            }
        }
    }
}
