package File;

public class spam {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = str.indexOf("World"); // Kết quả: 7
        int lastIndex = str.lastIndexOf("o"); // Kết quả: 8
        String lowerStr = str.toLowerCase(); // Kết quả: "hello, world!"
        String upperStr = str.toUpperCase(); // Kết quả: "HELLO, WORLD!"

        String str1 = "   Hello, World!   ";
        String trimmedStr = str.trim(); // Kết quả: "Hello, World!"

        String str3 = "Hello";
        String str2 = "hello";
        boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str2); // Kết quả: true
    }
}