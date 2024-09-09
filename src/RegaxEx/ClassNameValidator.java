package RegaxEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy kiểm tra tính hợp lệ
        String classNameRegex = "^[CAP][0-9]{4}[G-HIK]$";

        // Tạo pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(classNameRegex);

        // Tạo matcher để kiểm tra chuỗi đầu vào
        Matcher matcher = pattern.matcher(className);

        // Trả về true nếu chuỗi khớp với biểu thức chính quy, ngược lại trả về false
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames = {
                "C1234G",
                "A5678H",
                "P0000I",
                "Z1234K",
                "C12A4G",
                "C12345G",
                "C1234Z",
        };

        for (String name : classNames) {
            if (isValidClassName(name)) {
                System.out.println(name + " là tên lớp hợp lệ.");
            } else {
                System.out.println(name + " không phải là tên lớp hợp lệ.");
            }
        }

    }
}
