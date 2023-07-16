package practice.nod;

public class Nod {

    public int nod(Integer a, Integer b){
//    Реализовать метод для нахождения наибольшего общего делителя двух натуральных чисел.
//    Метод должен быть покрыт тестами.
//    Использовать Debugger для отладки решения.

    // Nod: (10,15) =5 , (48,24) = 24, (50,40) = 10 , (18,24) =6.

    Integer nod = 1;

    Integer min = a;
    if(a < b){
        min = a;
    }else{
        min = b;
    }
    int res = 0;
       while (nod <= min){
           if (a % nod == 0 && b % nod ==0){
               res = nod;

           }
           nod++;
       }
        return res;
    }
}