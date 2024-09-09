package RegaxEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    // Phương thức kiểm tra số điện thoại có hợp lệ không
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy kiểm tra tính hợp lệ của số điện thoại
        String phoneNumberRegex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

        // Tạo pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(phoneNumberRegex);

        // Tạo matcher để kiểm tra chuỗi đầu vào
        Matcher matcher = pattern.matcher(phoneNumber);

        // Trả về true nếu chuỗi khớp với biểu thức chính quy, ngược lại trả về false
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Một số ví dụ kiểm tra
        String[] phoneNumbers = {
                "(84)-(0123456789)",
                "(01)-(0987654321)",
                "(99)-(0123456789)",
                "84-0123456789",
                "(84)-123456789",
                "(841)-(0123456789)",
                "(84)-(01234a6789)",
        };

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber + " là số điện thoại hợp lệ.");
            } else {
                System.out.println(phoneNumber + " không phải là số điện thoại hợp lệ.");
            }
        }
    }
}


