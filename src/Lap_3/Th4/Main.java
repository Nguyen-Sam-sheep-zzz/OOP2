package Lap_3.Th4;

public class Main {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
        student.work();
        student.takeABreak();
    }
}
