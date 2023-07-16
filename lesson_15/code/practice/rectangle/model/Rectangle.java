package practice.rectangle.model;

public class Rectangle {
   public double a;


   public double b;

 // конструктор класса

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
// методы для установки полей класса

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    // метод для вычисдения периметра
    public double perimeter (double a, double b){
        return 2*a + 2*b;
    }
// вычисление площади
    public double square (double a, double b){
        return a * b;
    }
}
