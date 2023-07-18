package hw.shape;

public class Square extends Shape{
    public Square(double a) {
        super(a);
    }

    @Override
    public double calcArea() {
        double pl = a*a;
        return pl;
    }

    @Override
    public double calcPerimeter() {
        double perSq = a+a+a+a;
        return perSq;
    }
}
