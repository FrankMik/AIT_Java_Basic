public class BreakContinue {
    public static void main(String[] args) {
// napechatat`kazdij wtoroi element massiva

        int[] num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.print(num[i] + " , ");
        }
        System.out.println();
        int n = 553;
        for (int i = 2; i < n-1; i++) {
            if (553 % i == 0){
                System.out.println(n + " делится нацело " + i);
                break;
            }
        }
    }
}
