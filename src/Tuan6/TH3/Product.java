package Tuan6.TH3;

import java.io.Serializable;

public class Product implements Serializable {
    private int proID;
    private String proName;
    private double price;

    public Product() {
    }

    public Product(int proID, String proName, double price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    // Getter và Setter cho proID
    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    // Getter và Setter cho proName
    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    // Getter và Setter cho price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proID=" + proID +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
