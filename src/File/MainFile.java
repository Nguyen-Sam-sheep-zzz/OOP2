package File;

import java.io.File;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) throws IOException {
        // Tạo đối tượng File với tên tệp
        File file = new File("example.txt");
        file.createNewFile();

        // Kiểm tra sự tồn tại của tệp
        if (file.exists()) {
            System.out.println("Tệp đã tồn tại.");
        } else {
            System.out.println("Tệp không tồn tại.");
        }
        // Sử dụng phương thức getName() để lấy tên tệp
        String fileName = file.getName();
        System.out.println("Tên tệp: " + fileName);

        // Sử dụng phương thức getPath() để lấy đường dẫn tệp
        String filePath = file.getPath();
        System.out.println("Đường dẫn tệp: " + filePath);
    }
}


