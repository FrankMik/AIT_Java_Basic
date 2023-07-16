package ptactice;

import ptactice.model.Computer;

public class ComputerCompareAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer("i5", 8, 256, "Lenovo");
        Computer comp2 = new Computer("i5", 8, 256, "Lenovo");
        Computer comp3 = new Computer("i5", 8, 256, "HP");
        Computer comp4 = new Computer("i7", 16, 512, "Asus");
        Computer comp5 = new Computer("I7", 8, 256, "ASUS");


        System.out.println(comp1 == comp2);

        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.equals(comp3));

        Computer[] arrayOfComp = new Computer[5];
        arrayOfComp[0] = comp1;
        arrayOfComp[1] = comp2;
        arrayOfComp[2] = comp3;
        arrayOfComp[3] = comp4;
        arrayOfComp[4] = comp5;

        printArray(arrayOfComp);

        int sum = 0;
        for (int i = 0; i < arrayOfComp.length; i++) {
            sum = sum + arrayOfComp[i].getSsd();
        }
        System.out.println(sum);

    }
    // Methods
    // print an array
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}
