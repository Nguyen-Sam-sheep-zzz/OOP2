package Exception;

import java.io.IOException;

public class ThrowsAndThrowExample {
    // Phương thức này khai báo rằng nó có thể ném IOException
    public void readFile(String fileName) throws IOException {
        if (fileName == null) {
            // Sử dụng từ khóa throw để ném ra ngoại lệ
            throw new IOException("File name cannot be null");
        }
        // Logic đọc file...
        System.out.println("Reading file: " + fileName);
    }

    public static void main(String[] args) {
        ThrowsAndThrowExample example = new ThrowsAndThrowExample();
        try {
            // Gọi phương thức có thể ném IOException
            example.readFile(null);
        } catch (IOException e) {
            // Bắt và xử lý IOException
            System.out.println("Caught an IOException: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
