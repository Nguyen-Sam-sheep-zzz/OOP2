package DeCuong.Bai2;

import java.util.Arrays;

public class AppRectangle {
    public static void main(String[] args) {
        CRUDRectangle crud = new CRUDRectangle();

        // Tạo 3 đối tượng hình chữ nhật
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(6, 7);
        Rectangle rect3 = new Rectangle(8, 9);

        // Lưu từng đối tượng vào mảng danh sách hình chữ nhật
        crud.addRectangle(rect1);
        crud.addRectangle(rect2);
        crud.addRectangle(rect3);

        // Lưu từng đối tượng hình chữ nhật vào file
        crud.addRectangleToFile(rect1, "rectangle1.dat");
        crud.addRectangleToFile(rect2, "rectangle2.dat");
        crud.addRectangleToFile(rect3, "rectangle3.dat");

        // Hiển thị thông tin của hình chữ nhật từ file
        Rectangle r1FromFile = crud.getRectangleFromFile("rectangle1.dat");
        Rectangle r2FromFile = crud.getRectangleFromFile("rectangle2.dat");
        Rectangle r3FromFile = crud.getRectangleFromFile("rectangle3.dat");

        System.out.println("Rectangle 1 from file: " + r1FromFile);
        System.out.println("Rectangle 2 from file: " + r2FromFile);
        System.out.println("Rectangle 3 from file: " + r3FromFile);

        // Lưu mảng đối tượng hình chữ nhật vào file
        crud.addRectangleListToFile(new Rectangle[]{rect1, rect2, rect3}, "rectangles.dat");

        // Hiển thị tất cả thông tin hình chữ nhật trong mảng đối tượng hình chữ nhật từ file
        Rectangle[] rectanglesFromFile = crud.getAllRectangleFromFile("rectangles.dat");
        System.out.println("All rectangles from file: " + Arrays.toString(rectanglesFromFile));
    }
}
