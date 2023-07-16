package hw.pets;

public class Pet {
//    Create a class Pet (pets) with fields:
//  type (cat, dog, ...)
//  weight
//  living conditions (at home, on the street)
//  Create child classes Cat and Dog with additional fields: name, breed, age.
//  Create an eat, sleep method for both classes and a run method (to walk) for the Dog class.
//  Create a voice method that emits "Meow!" for the Cat class and "Wow-wow!" for the Dog class.
//  Create a HouseAppl that has a main method.
//  Settle in the house 2 dogs and 3 cats. Simulate life in this house during the day.

    //  создаём поля
    private String type;
    private int weight;
    private String stay;

    // создаём конструктор


    public Pet(String type, int weight, String stay) {
        this.type = type;
        this.weight = weight;
        this.stay = stay;
    }
    // создаём метод display для вывода
    public void display(){
        System.out.println("Type: " + type + ", weight- " + weight + ", stay:" + stay);
    }
    // создаём getter and setter для вывода

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStay() {
        return stay;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }
}
