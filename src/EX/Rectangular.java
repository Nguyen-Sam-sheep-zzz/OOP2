package EX;

public class Rectangular extends Rectangle {
    private double height;

    public Rectangular(String name, double width, double length, double height) {
        super(name, width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurroundingArea() {
        return (getWidth() + getLength()) * getHeight() * 2;
    }

    public double getTotalArea() {
        return getSurroundingArea() + 2 * getWidth() * getLength();
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
