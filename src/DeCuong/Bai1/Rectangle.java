package DeCuong.Bai1;

public class Rectangle extends Shape {
    private double width;
    private double height;


    Rectangle() {

    }

    @Override
    public double calArea() {
        return getWidth() * getHeight();
    }

    Rectangle(String shapeName, String color, double width, double height) {
        super(shapeName, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ", name=" + getShapeName() +
                ", color=" + getColor() +
                ']';
    }
}
