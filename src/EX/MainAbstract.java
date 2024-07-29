package EX;

public class MainAbstract {
    public static void main(String[] args) {
        System.out.println("Tiger :");
        Tiger Tiger = new Tiger();
        System.out.println(Tiger.eat("Meet"));
        System.out.println(Tiger.eat());
        System.out.println("-----------------------------------");
        Square square = new Square("square", 7);
        Rectangle rectangle = new Rectangle("rectangle", 5, 7);
        System.out.println("Area square: " + square.getArea());
        System.out.println("Perimeter square: " + square.getPerimeter());
        System.out.println("Area Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter Rectangle: " + rectangle.getPerimeter());
    }
}
