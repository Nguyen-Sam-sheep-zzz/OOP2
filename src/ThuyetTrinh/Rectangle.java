package ThuyetTrinh;

public class Rectangle extends Geometric {
    double width;
    double length;

    Rectangle() {

    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (getWidth() * getLength());
    }

    @Override
    public double getPerimeter() {
        return ((getLength() + getWidth()) * 2);
    }
}
