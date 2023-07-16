package hw.pets;

public class Dog extends Pet {

    // создаём дополнительные поля
    private String name;
    private String breed;
    private int age;

    // создаём конструктор
    public Dog(String type, int weight, String stay, String name, String breed, int age) {
        super(type, weight, stay);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    // создаём метод eat
    public void eat(){
        System.out.println("Eat!");
    }
    // создаём метод sleep
    public void sleep(){
        System.out.println("Sleep!");
    }
    public void run(){
        System.out.println("Run!");
    }
    public void wau(){
        System.out.println("Wau!");
    }
    // создаём метод display для вывода
    public void display(){
        super.display();
        System.out.println("Name: " + name + " breed:" + breed + " age " + age);
    }
    // создаём getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
