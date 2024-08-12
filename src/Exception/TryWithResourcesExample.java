package Exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng cả BufferedReader và BufferedWriter
        try (
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // Ghi xuống dòng mới
            }
        } catch (IOException e) {
            // Xử lý ngoại lệ nếu có
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}

