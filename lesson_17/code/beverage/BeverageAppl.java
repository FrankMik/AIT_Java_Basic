package beverage;

public class BeverageAppl {
    public static void main(String[] args) {

        Beverage bev1 = new Beverage();
        bev1.displayStock();
        bev1.toBuy("Cola", " bootle", 5);
        bev1.displayStock();

        Beverage bev2 = new Beverage();
        bev2.toBuy("Wine", " box", 2);
        bev2.displayStock();

        Beer beer1 = new Beer();
        beer1.toBuy("Beer", " box", 3, "white");
        beer1.displayStock();
    }
}
