package Tuan6.Read;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadToFile {
    public static String readData(String fileName) throws IOException {
        FileInputStream fis = null;
        StringBuilder sb = new StringBuilder();
        try {
            fis = new FileInputStream(fileName);
            int data;
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            return sb.toString();
        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi đọc từ file: " + e.getMessage());
            throw e;
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Lỗi khi đóng file: " + e.getMessage());
            }
        }
    }
}
