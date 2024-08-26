package Tuan6.Write;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static boolean writeData(String data, String fileName) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            fos.write(data.getBytes());
            return true;
        } catch (IOException e) {
            System.out.println("say ra loi khi ghi vao file: " + e.getMessage());
            return false;
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("loi dong file: " + e.getMessage());
            }
        }
    }
}
