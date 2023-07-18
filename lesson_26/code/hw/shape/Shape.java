package hw.shape;

public abstract class Shape {
//    Create an abstract class Shape with field type double and abstract methods calcArea and calcPerimeter.
//    Create classes Circle, Triangle, Square that extend the Shape class and implement abstract methods.
//    Write a FigureAppl class with a main method. In the method, create an array of shapes.
//    Add two circles to the array, one triangle and one square.
//    Calculate the total area and total perimeter of all shapes from an array of shapes.

    protected double a;
    // constructor

    public Shape(double a) {
        this.a = a;
    }
    // getter and setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    //abstract method calcArea

    public abstract double calcArea();

    //abstract method calcPerimeter

    public abstract double calcPerimeter();

    // method to String


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Figure");
        sb.append(" Side = ").append(a);
        sb.append(" Area = ").append(calcArea());
        sb.append(" Perimeter = ").append(calcPerimeter());
        return sb.toString();
    }
}
