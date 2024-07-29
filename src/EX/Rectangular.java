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

    public double getVolume() {
        return getArea() * height;
    }
}
