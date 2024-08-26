package Tuan6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("person.dat");
            String data = "Tammy";
            fos.write(data.getBytes());
        }
        catch (IOException e) {
            System.out.println("Xảy ra lỗi khi ghi vào file: " + e.getMessage());
        }
        finally {
            try {
                if (fos!= null) {
                    fos.close();
                }
            }
            catch (IOException e) {
                System.out.println("Lỗi khi đóng file " + e.getMessage());
            }
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("person.dat");
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            System.out.println("\nĐọc dữ liệu thành công từ file person.dat.");
            System.out.println(sb);
        }
        catch (IOException e) {
            System.out.println("Xảy ra lỗi khi đọc file " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch (IOException e) {
                System.out.println("xảy ra lỗi khi đóng file " + e.getMessage());
            }
        }
    }
}
