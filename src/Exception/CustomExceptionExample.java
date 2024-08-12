package Exception;

// Tạo lớp ngoại lệ tùy chỉnh
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    // Phương thức kiểm tra tuổi và ném ngoại lệ tùy chỉnh nếu tuổi không hợp lệ
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();
        try {
            // Kiểm tra tuổi, tuổi này sẽ gây ra ngoại lệ
            example.checkAge(16);
        } catch (InvalidAgeException e) {
            // Bắt và xử lý ngoại lệ tùy chỉnh
            System.out.println("Caught an InvalidAgeException: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
