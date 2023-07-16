package hw;

import java.util.Objects;

public class MilkFood extends Food{
    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode, isOutOfDate);
    }

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , Barcode: " + barCode + " , price: " + price + " , milkType: " + milkType + ", fat: " + fat +" , is Out Of Date: " + isOutOfDate;
    }
}
