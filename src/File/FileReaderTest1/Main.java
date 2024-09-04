package File.FileReaderTest1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static boolean writeToFile(String filePath, String data) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(data);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return content.toString();
    }

    public static void main(String[] args) {
        // Đường dẫn tệp để ghi dữ liệu
        String filePath = "example.txt";

        // Dữ liệu cần ghi vào tệp
        String dataToWrite = "TammyPham\nBeTammy. 18\n20 ";

        // Ghi dữ liệu vào tệp
        boolean writeSuccess = writeToFile(filePath, dataToWrite);
        if (writeSuccess) {
            System.out.println("Data written to file successfully.");
        } else {
            System.out.println("Failed to write data to file.");
        }
        // Đọc dữ liệu từ tệp
        String fileContent = readFromFile(filePath);

        if (fileContent != null) {
            System.out.println("Data read from file:");
            System.out.println(fileContent);
        } else {
            System.out.println("Failed to read data from file.");
        }

    }

}
