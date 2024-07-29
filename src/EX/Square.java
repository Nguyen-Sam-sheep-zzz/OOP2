package EX;

public class Square extends Geometric{
    private double width;

    public Square(String name, double width) {
        super(name);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }
}
