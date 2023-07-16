package hw.pets;

public class HouseAppl {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog", 4, " at home", "Barbos,", " pug,", 3);
        Dog dog2 = new Dog("dog", 16, " in the courtyard", "Sharik,", " sheepdog,", 2);
        Cat cat1 = new Cat("cat", 2, " at home", "Murka,", " siamese,", 6);
        Cat cat2 = new Cat("cat", 1, " at home", "Was`ka,", " siberian,", 1);
        Cat cat3 = new Cat("cat", 3, " at home", "Bagira,", " scottish fold,", 3);
        dog1.display();
        dog1.wau();
        dog1.eat();
        dog1.wau();
        dog1.run();
        dog1.sleep();
        System.out.println();
        dog2.display();
        dog2.wau();
        dog2.eat();
        dog2.wau();
        dog2.sleep();
        dog2.run();
        System.out.println();
        cat1.display();
        cat1.miau();
        cat1.eat();
        cat1.sleep();
        System.out.println();
        cat2.display();
        cat2.miau();
        cat2.sleep();
        cat2.eat();
        System.out.println();
        cat3.display();
        cat3.miau();
        cat3.eat();
        cat3.sleep();
    }
}
