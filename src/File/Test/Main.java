package File.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean saveToFile(List<Student> students, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                String studentData = String.format("%d,%s,%.2f,%.2f,%.2f",
                        student.getIdStudent(),
                        student.getName(),
                        student.getToan(),
                        student.getLy(),
                        student.getHoa());
                writer.write(studentData);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Student[] readFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 5) {
                        try {
                            int idStudent = Integer.parseInt(parts[0].trim());
                            String name = parts[1].trim();
                            double toan = Double.parseDouble(parts[2].trim());
                            double ly = Double.parseDouble(parts[3].trim());
                            double hoa = Double.parseDouble(parts[4].trim());

                            students.add(new Student(idStudent, name, toan, ly, hoa));
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return students.toArray(new Student[0]);
    }

    public static void main(String[] args) {
        String filePath = "Student.txt";
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tammy", 8.5, 9.0, 7.5));
        students.add(new Student(2, "SuperTammy", 7.5, 8.0, 6.5));
        students.add(new Student(3, "ChibiTammy", 9.0, 9.5, 8.0));
        saveToFile(students, filePath);

        Student[] readStudents = readFromFile(filePath);
        for (Student student : readStudents) {
            System.out.println("ID: " + student.getIdStudent() +
                    ", Name: " + student.getName() +
                    ", Toan: " + student.getToan() +
                    ", Ly: " + student.getLy() +
                    ", Hoa: " + student.getHoa());
        }
    }
}


