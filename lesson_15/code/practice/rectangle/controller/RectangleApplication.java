package practice.rectangle.controller;

import practice.rectangle.model.Rectangle;

public class RectangleApplication {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.0, 25.0); //создаём объект
        System.out.println(rectangle1.perimeter(10.0, 25.0));
        double s = rectangle1.square(10.0, 25.0);
        System.out.println("Square is: " + s);

        rectangle1.setA(50.0);
        rectangle1.setB(100.0);

        System.out.println(rectangle1.a);
        System.out.println(rectangle1.b);
        System.out.println(rectangle1.perimeter(rectangle1.a, rectangle1.b));
    }
}
