package EX;

public class MainExtends {
    public static void main(String[] args) {
        System.out.println("Tiger make sound: ");
        Animal Tiger = new Tiger();
        Tiger.makeSound();
        System.out.println("--------------------------------");
        System.out.println("Volume rectangular: ");
        Rectangular rectangular = new Rectangular("rectangular", 5, 7, 9);
        System.out.println(rectangular.getVolume());
    }
}
