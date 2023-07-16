package hw.User;

public class UserAppl {
    public static void main(String[] args) {
        User user1 = new User("Viktor", "Petrov", 32);
        User user2 = new User("Komarov", "Andrej", 12);
        Adult user3 = new Adult("Ivan", "Ster", 33, "ivan33@gmx.de", "I123S123","017658746354", "123.456.7.8");
        Adult user4 = new Adult("Sviridova", "Valentina", 28, "swerVa@yahoo.com", "SV3456", "0405678398","134.23.45");
        UnderAge user5 = new UnderAge("Anna", "Schwarz", 34, "anS23@mail.ru", "Anna456", "01765896476", "156.7.45", false);
        UnderAge user6 = new UnderAge("Peter", "Sidorov", 19, "pstr@mail.ua", "sdf987", "123546789", "128.56.4", true);

        System.out.println(user1.equals(user2));

        System.out.println();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);


    }
}
