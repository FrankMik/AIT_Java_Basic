package computer;

public class Laptop extends Computer{
    private int size;
    private int weight;

    public Laptop(String cpu, int ram, int ssd, String brand, int size, int weight) {
        super(cpu, ram, ssd, brand);
        this.size = size;
        this.weight = weight;

    }

    public void display(){
       super.display();
        System.out.print(" Size: " + size + " Weight: " + weight);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}

