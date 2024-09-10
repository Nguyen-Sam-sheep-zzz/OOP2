package DeCuong.Test;

import java.io.*;
import java.util.ArrayList;

public class CRUDRectangle {
    private static final int MAX_RECTANGLES = 100;
    private Rectangle[] rectangles;
    private static int numberOfRectangle;

    // Constructor không tham số
    public CRUDRectangle() {
        this.rectangles = new Rectangle[MAX_RECTANGLES];
        numberOfRectangle = 0;
    }

    // Phương thức thêm hình chữ nhật vào danh sách
    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle < MAX_RECTANGLES) {
            rectangles[numberOfRectangle++] = objRectangle;
            return true;
        }
        return false;
    }

    // Phương thức lưu một hình chữ nhật vào file
    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(objRectangle.getLength() + "," + objRectangle.getWidth());
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức trả về đối tượng hình chữ nhật từ file
    public Rectangle getRectangleFromFile(String filename, double length, double width) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                double fileLength = Double.parseDouble(parts[0]);
                double fileWidth = Double.parseDouble(parts[1]);
                if (fileLength == length && fileWidth == width) {
                    return new Rectangle(fileLength, fileWidth);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức lưu danh sách hình chữ nhật vào file
    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Rectangle rect : listRectangle) {
                if (rect != null) {
                    writer.write(rect.getLength() + "," + rect.getWidth());
                    writer.newLine();
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức trả về danh sách hình chữ nhật từ file
    public Rectangle[] getAllRectangleFromFile(String filename) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                rectangleList.add(new Rectangle(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rectangleList.toArray(new Rectangle[0]);
    }
}
