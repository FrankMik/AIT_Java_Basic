package hw;

import java.util.Objects;

public class Product {
    //Create class Product, with fields private double price; private Stringname; private long barCode;
    //Create class Food extending class Product with field private boolean isOutOfDate;,
    // responsible for the suitability of the product.
    //Create class MeatFood extending class Food with field private String meatType;,
    // which stores the type of meat from which the product is made.
    //Create class MilkFood extending class Food with fields private String milkType;
    // private double fat;, which store the type of milk and the fat content of the product, respectively.
    //In all classes, override the toString method.
    //In the ProductsAppl class, create an array in the main method,
    // which stores at least one object for each product. Create a method that prints all products from an array,
    // and a method that returns the sum of the prices of all products in the store.
    double price;
    String name;
    long barCode;
    // Constructor

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    // Getter and Setter

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }
    // Method to String

    @Override
    public String toString() {
        return "Name: " + name + " , Barcode: " + barCode + " , price: " + price;
    }
    // Object comparison

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return (barCode == product.barCode);
    }

}
