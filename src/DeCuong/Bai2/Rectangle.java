package DeCuong.Bai2;

import java.io.Serializable;

public class Rectangle implements Serializable {

    private double length;
    private double width;

    Rectangle() {

    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        return this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", area=" + getArea() + "]";
    }

}
