package File;

import java.io.File;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        // Đường dẫn tệp hoặc thư mục cần kiểm tra
        String filePath = "example.txt"; // Thay đổi đường dẫn này theo nhu cầu

        // Tạo đối tượng File
        File file = new File(filePath);

        // Kiểm tra xem tệp hoặc thư mục có tồn tại không
        if (file.exists()) {
            System.out.println("File or directory exists.");

            // Kiểm tra nếu là thư mục
            if (file.isDirectory()) {
                System.out.println(filePath + " is a directory.");
            } else {
                System.out.println(filePath + " is a file.");
            }

            // Hiển thị đường dẫn tuyệt đối
            System.out.println("Absolute path: " + file.getAbsolutePath());
        } else {
            System.out.println("File or directory does not exist.");

            // Tạo tệp mới nếu không tồn tại
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("File already exists or could not be created.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }
    }
}

