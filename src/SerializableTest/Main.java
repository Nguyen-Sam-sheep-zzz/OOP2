package SerializableTest;

import java.io.*;

public class Main {

    public static void writeObjectToFile(String fileName, Object obj) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(obj);
            System.out.println("Đối tượng đã được ghi vào file: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object readObjectFromFile(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            Object obj = objectIn.readObject();
            System.out.println("Đối tượng đã được đọc từ file: " + fileName);
            return obj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Không có dữ liệu trong file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        String fileName = "person.txt";

        // Tạo đối tượng Person
        Person person= new Person("Tammy", 20);

        // Ghi đối tượng vào file
        writeObjectToFile(fileName, person);

        // Đọc đối tượng từ file
        Person readPerson = (Person) readObjectFromFile(fileName);

        // Hiển thị đối tượng đã đọc
        if (readPerson != null) {
            System.out.println("Đối tượng đọc được: " + readPerson);
        }
    }
}
