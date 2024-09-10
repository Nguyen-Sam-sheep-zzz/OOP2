package DeCuong.Test;

public class AppRectangle {
    public static void main(String[] args) {
        CRUDRectangle crud = new CRUDRectangle();
        String filename = "rectangles.txt";

        // Tạo 3 đối tượng hình chữ nhật
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0, 2.0);
        Rectangle rect3 = new Rectangle(6.0, 4.0);

        // Lưu từng đối tượng vào mảng danh sách hình chữ nhật
        crud.addRectangle(rect1);
        crud.addRectangle(rect2);
        crud.addRectangle(rect3);

        // Lưu từng đối tượng hình chữ nhật vào file
        crud.addRectangleToFile(rect1, filename);
        crud.addRectangleToFile(rect2, filename);
        crud.addRectangleToFile(rect3, filename);

        // Hiển thị thông tin của hình chữ nhật từ file
        Rectangle retrievedRect = crud.getRectangleFromFile(filename, 4.0, 2.0);
        if (retrievedRect != null) {
            System.out.println("Retrieved Rectangle: " + retrievedRect.toString());
        } else {
            System.out.println("Rectangle not found.");
        }

        // Lưu mảng đối tượng hình chữ nhật vào file
        Rectangle[] rectangleList = {rect1, rect2, rect3};
        crud.addRectangleListToFile(rectangleList, filename);

        // Hiển thị tất cả thông tin hình chữ nhật trong mảng đối tượng hình chữ nhật từ file
        Rectangle[] allRectangles = crud.getAllRectangleFromFile(filename);
        for (Rectangle rectangle : allRectangles) {
            System.out.println("Rectangle from file: " + rectangle.toString());
        }
    }
}

