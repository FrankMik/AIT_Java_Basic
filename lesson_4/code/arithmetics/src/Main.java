public class Main {
    public static void main(String[] args) {
        System.out.println("Арифметические действия и класс Math");
        int x, y;
        x = 135;
        y = 213;

        int z = Math.max(x, y);
        System.out.println("max fon " + x + " und " + y + " = " + z);
        int z1 = Math.min(x, y);
        System.out.println("min fon "+ x + " und " + y + " = " + z1);

        int a = 321;
        System.out.println(Math.abs(a));//abs - модуль числа а

        int b = 512;
        System.out.println(Math.abs(b));//abs - модуль числа b

        int n = 2;
        int k = 10;
        int pow2 = (int)Math.pow(n, k);
        double pow2d = Math.pow(n, k);
        System.out.println(pow2);
        System.out.println(pow2d);
        System.out.println(Math.PI);

        double s = Math.sqrt(10000.0d); // извлечение квадратного корня
        System.out.println(s);
       /* double a = 10.0d;
        double b = 3.0d;

        double c;

        c = a / b;

        System.out.println(c);
        System.out.printf("результат деления: %.2f", c ); // форматированный вывод
        int x = 57;
        int y = 10;
       // x = x + 5;
        x++;

        System.out.println(x);

        y--;

        System.out.println(y);


        x += 10;
        System.out.println(x);
        y -= 4;
        System.out.println(y);
        x *= 2;
        System.out.println("X = " + x);
       _____________________
       /* int z;
       z = x / y;
        System.out.println("частное " + x + " на " + y + " = " + z);
        int zz;
        zz = x % y;
        System.out.println("остаток от деления " + x + " на " + y + " = " + zz);
        int x1 = 3;
        int y1 = 10;
        int z1;
        z1 = x1 / y1;
        System.out.println("частное " + x1 + " на " + y1 + " = " + z1);
        int zz1;
        zz1 = x1 % y1;
        System.out.println("остаток от деления " + x1 + " на " + y1 + " = " + zz1);

        */
    }
}