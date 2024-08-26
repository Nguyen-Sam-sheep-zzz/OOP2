package Tuan6.Read;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String fileName = "data.dat";
        try {
            String resultData = ReadToFile.readData(fileName);
            System.out.println("Dữ liệu đọc từ file " + fileName + ":");
            System.out.println(resultData);
        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi đọc từ file: " + e.getMessage());
        }
    }
}
