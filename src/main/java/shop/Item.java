package shop;

/**
 * Created by AlexanderSavenok on 12/27/2016.
 */
public class Item {

    private String name;
    private double price;

    public void setName(String name) {this.name = name;}

    public String getName() {return this.name;}

    public void setPrice(double price) {this.price = price;}

    public double getPrice() {return price;}

    public String toString() {return String.format("Class: %s; Name: %s; Price: %s; ", getClass(), name, price);}

}
