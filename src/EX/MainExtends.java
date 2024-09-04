package EX;

public class MainExtends {
    public static void main(String[] args) {
//        System.out.println("Tiger make sound: ");
//        Animal Tiger = new Tiger();
//        Tiger.makeSound();
//        System.out.println("--------------------------------");
        System.out.println("Rectangular: ");
        Rectangular rectangular = new Rectangular("rectangular", 5, 7, 9);
        System.out.println("Volume rectangular: " + rectangular.getVolume());
        System.out.println("SurroundingArea rectangular: " + rectangular.getSurroundingArea());
        System.out.println("Total area rectangular: " + rectangular.getTotalArea());
        System.out.println("--------------------------------");
        System.out.println("Cube: ");
        Cube cube = new Cube("Cube", 7);
        System.out.println("SurroundingArea cube: " + cube.getSurroundingAreaCube());
        System.out.println("Total area cube: " + cube.getTotalArea());
        System.out.println("Volume rectangular: " + cube.getVolumeCube());
    }
}
