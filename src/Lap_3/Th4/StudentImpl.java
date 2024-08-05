package Lap_3.Th4;

import java.sql.SQLOutput;

public class StudentImpl extends People implements Student,Employee {
    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }


    @Override
    public void eat() {
        System.out.println( getName() +" Eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleep");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println(getName() + " has registered for the " + course);
    }

    @Override
    public void attendClass() {
        System.out.println(getName() + " attended the class. ");
    }

    @Override
    public void work() {
        System.out.println(getName() + " working " );
    }

    @Override
    public void takeABreak() {
        System.out.println(getName() + " relax");
    }
}