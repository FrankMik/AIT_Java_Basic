package hw.cube.model;

public class Cube {
//   Создать класс Cube, описывающий куб cо стороной a.
//   Реализовать в нем методы определения периметра p, площади s и объема v.
//   Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
//   Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    public double a;



//   конструктор класса


    public Cube(double a) {
        this.a = a;
    }

//   методы для установки полей класса

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


//   метод для вычисдения периметра

    public double perimeter (double a){

        return 12*a;
    }

//    вычисление площади

    public double square (double a){

        return 6*(a * a);
    }

//    вычисление объёма

     public double volume (double a){

        return a*a*a;
     }


}
