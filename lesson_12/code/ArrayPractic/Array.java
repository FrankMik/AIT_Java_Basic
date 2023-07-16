public class Array {
    public static void main(String[] args) {
        System.out.println("Array practice");

        int[] marks = {2, 5, 4, 5, 3, 5, 4, 1};

        int l = marks.length;
        System.out.println("Length of array " + l);

        System.out.println(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            
        }
        System.out.println(marks[marks.length -1]);
    }
}
