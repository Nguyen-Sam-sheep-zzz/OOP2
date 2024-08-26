package Tuan6.Write;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập dữ liệu để ghi vào file:");
        String inputData = scanner.nextLine();

        String fileName = "data.dat";

        boolean result = WriteToFile.writeData(inputData, fileName);

        if (result) {
            System.out.println("Dữ liệu đã được ghi thành công vào file " + fileName);
        } else {
            System.out.println("Ghi dữ liệu vào file thất bại.");
        }
    }
}
