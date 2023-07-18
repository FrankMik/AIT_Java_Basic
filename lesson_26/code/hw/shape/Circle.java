package hw.shape;

public class Circle extends Shape{

    public Circle(double a) {
        super(a);
    }

    @Override
    public double calcArea() {
     double s = Math.PI*(a*a);
        return s;
    }

    @Override
    public double calcPerimeter() {
        double p = (2*Math.PI)*a;
        return p;
    }
}
