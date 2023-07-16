public class ClassWork {
    public static void main(String[] args) {
//       Имеются оценки абитуриента из его аттестата, всего 12 оценок.
//       Найдите средний балл абитуриента.
        System.out.println("Hello and welcome!");
        int[] array = {5, 3, 3, 4, 5, 3, 4, 5, 4, 5, 3, 3};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double result = sum/ array.length;
        System.out.println("Средний балл " + result);
        System.out.println("");
        System.out.printf("Средний балл: %.02f",result);
    }
}
