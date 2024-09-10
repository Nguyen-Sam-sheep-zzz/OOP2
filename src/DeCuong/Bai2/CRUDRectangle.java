package DeCuong.Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDRectangle {

    private Rectangle[] rectangles;
    private static int numOfRectangle = 0;

    public CRUDRectangle() {
        rectangles = new Rectangle[100];
        numOfRectangle = 0;
    }

    public boolean addRectangle(Rectangle objRectangle) {
        if (numOfRectangle < rectangles.length) {
            rectangles[numOfRectangle++] = objRectangle;
            return true;
        }
        return false;
    }

    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename, true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Rectangle getRectangleFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Rectangle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Rectangle rectangle : listRectangle) {
                if (rectangle != null) {
                    oos.writeObject(rectangle);
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Rectangle[] getAllRectangleFromFile(String filename) {
        List<Rectangle> rectangleList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Rectangle rectangle = (Rectangle) ois.readObject();
                    rectangleList.add(rectangle);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rectangleList.toArray(new Rectangle[0]);
    }
}


