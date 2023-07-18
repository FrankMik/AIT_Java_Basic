package hw.shape;

public class Triangle extends Shape{
    public Triangle(double a) {
        super(a);
    }

    @Override
    public double calcArea() {
        double pP = (a+a+a)/2;
        double sT = Math.sqrt(pP-a)*(pP-a)*(pP-a);
        return sT;
    }

    @Override
    public double calcPerimeter() {
        double per = a+a+a;
        return per;
    }
}
