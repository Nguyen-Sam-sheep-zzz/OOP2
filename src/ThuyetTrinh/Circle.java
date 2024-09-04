package ThuyetTrinh;

public class Circle extends Geometric {
    double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI) * (getRadius() * getRadius());
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI) * (getRadius());
    }
}
