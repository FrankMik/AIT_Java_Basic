package hw;

import java.util.Objects;

public class Food extends Product{

    public boolean isOutOfDate;



    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }


    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }

    @Override
    public String toString() {
        return "is Out Of Date: " + isOutOfDate;
    }


}
