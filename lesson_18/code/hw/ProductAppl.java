package hw;

public class ProductAppl {
    public static void main(String[] args) {
        MeatFood food1 = new MeatFood(8.50, "Pelmeny", 123456L, true , "mixed minced meat");
        MeatFood food2 = new MeatFood(9.99, "turkey fillet", 123456L, true, "turkey");
        MeatFood food3 = new MeatFood(16.30, "shashlik", 124567L, false, "pork");
        MeatFood food4 = new MeatFood(23.50, "steak", 123567L, true, "beef");
        MeatFood food5 = new MeatFood(7.90, "mincemeat", 145678L,false,  "minced meat");
        MilkFood food6 = new MilkFood(0.98, "Milk", 234578L, false, "skimmed milk", 1.5);
        MilkFood food7 = new MilkFood(1.25, "Proctokvashino", 234569L,true,  "concentrated milk", 8.5);
        MilkFood food8 = new MilkFood(0.79, "Erdmann", 234678L, true, "yogurt", 2.7);
        MilkFood food9 = new MilkFood(2.99, "gauda", 2356785L, false, "cheese", 45);
        MilkFood food0 = new MilkFood(1.89, "Molochnaja devochka", 2348765L, true, " condensed milk", 8.5);

        Food[] foods = new Food[10];
        foods[0] = food1;
        foods[1] = food2;
        foods[2] = food3;
        foods[3] = food4;
        foods[4] = food5;
        foods[5] = food6;
        foods[6] = food7;
        foods[7] = food8;
        foods[8] = food9;
        foods[9] = food0;

        onTheShelf(foods);

        System.out.println(food1.equals(food2));  // сравниваем продукты по баркоду

        double sumOfPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            sumOfPrice = sumOfPrice + foods[i].getPrice();

        }
        System.out.printf("Sum of price is: %.2f",sumOfPrice);


    }
    public static void onTheShelf(Object[] foo){
        for (int i = 0; i < foo.length; i++) {
            System.out.println(foo[i].toString());
        }

    }

}
