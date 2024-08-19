package File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("example.txt", true)) { // true để thêm dữ liệu vào cuối tệp
            // Ghi một chuỗi vào tệp
            writer.write("Hello, World!\n");
            writer.write("TammyPham");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
