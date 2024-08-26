package Tuan6.TH3;

import java.io.*;
import java.util.ArrayList;

public class ProductProcess {

    public static boolean writeObjectData(Product objProduct, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(objProduct);
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
            return false;
        }
    }

    public Product[] readObjectData(String fileName) {
        ArrayList<Product> productList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Product product = (Product) ois.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
            return productList.toArray(new Product[0]);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file: " + e.getMessage());
            return null;
        }
    }
}
