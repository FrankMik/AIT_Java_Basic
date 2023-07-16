package hw;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode, isOutOfDate);
    }

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , Barcode: " + barCode + " , price: " + price + " , Meat type: " + meatType + " , is Out Of Date: " + isOutOfDate;
    }
}
