package hw.array;

public class Array {
    //  Create an array of 100 random integers between -10 and 10. Calculate how many are in this array:
    //
    //  positive numbers;
    //  negative numbers;
    //  even numbers;
    //  zero. Formulate a solution to this problem by methods and write tests for them.
   // public static void main(String[] args){
//        Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
//        Подсчитайте, сколько в этом массиве оказалось:
//        - положительных чисел;
//        - отрицательных чисел;
//        - четных чисел;
//        - нулей.

            int[] myArray = new int[10];

            int a = -10;
            int b = 10;
          public int myArray(int[] array){
              for (int i = 0; i < myArray.length; i++) {
                  myArray[i] = (int) (Math.random() * (b - a + 1) + a);
              }
              return 0;
          }

       // }
        public int printArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            return 0;
        }

        public  int zeroCount (int[] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    count++;
                }
            }
            return count;
        }

        public int positiveCount(int[] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    count++;
                }
            }
            return count;
        }

        public int evenCount(int[] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
}
