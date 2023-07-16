package beverage;

public class Beer extends Beverage {

    String type; // white or dark
  // конструктор
    public Beer() {
        super();
    }

    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }

    // метод для закупки
    public void toBuy(String title, String packing, int quantity, String type){
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    //  метод для показа того что в клодовке
    public void displayStock(){
        super.displayStock();
        System.out.println("This is " + type + " beer.");
    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
