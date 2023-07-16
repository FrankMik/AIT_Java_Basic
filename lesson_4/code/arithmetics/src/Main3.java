public class Main3 {
    public static void main(String[] args) {
       double a = 180.0;
        double b = 45.0;
        double c = 32.0;
        System.out.format("%.1f радиан = %.3f градусов %n", a, Math.toDegrees(a));
        System.out.format("%.1f радиан = %.3f градусов %n", b, Math.toDegrees(b));
        System.out.format("%.1f радиан = %.3f градусов %n", c, Math.toDegrees(c));
        int[] nums = {18, 16, 19, 19, 17, 19, 21};
        int result = 0;
        for (int m : nums) {
            result += m;
        }
        System.out.println("средняя температура за неделю в Гамбурге: " + result / nums.length);

    }
}