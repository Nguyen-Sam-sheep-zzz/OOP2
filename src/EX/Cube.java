package EX;

public class Cube extends Square {

    public Cube(String name, double width) {
        super(name, width);
    }

    public double getSurroundingAreaCube() {
        return getArea() * 4;
    }

    public double getTotalArea() {
        return getArea() * 6;
    }

    public double getVolumeCube() {
        return getArea() * getWidth();
    }
}
