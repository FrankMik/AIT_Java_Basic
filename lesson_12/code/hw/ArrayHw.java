public class ArrayHw {
 /*   public static void main(String[] args) {
//    Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать.
//    Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
        int[] myArray = {13, 19, 17, 11, 15, 12, 10, 14, 17, 16, 15, 11, 20, 14, 12, 16, 13, 18, 20, 10};
        System.out.println(myArray);
        System.out.println(myArray.length);
//   здесь у меня не потучилось!!!
    }

  */

    public static void main(String[] args) {
        int[] myArray = new int[20];
        myArray[0] = 13;
        myArray[1] = 19;
        myArray[2] = 17;
        myArray[3] = 11;
        myArray[4] = 15;
        myArray[5] = 12;
        myArray[6] = 10;
        myArray[7] = 14;
        myArray[8] = 17;
        myArray[9] = 16;
        myArray[10] = 15;
        myArray[11] = 11;
        myArray[12] = 20;
        myArray[13] = 14;
        myArray[14] = 12;
        myArray[15] = 16;
        myArray[16] = 13;
        myArray[17] = 18;
        myArray[18] = 20;
        myArray[19] = 10;

        for (int i = 0; i < 20; i++) {
        System.out.println(myArray[i]);
        }
// при изменении элемента в квадратных скобках выходит на начало элемент с номером 0
    }
}
