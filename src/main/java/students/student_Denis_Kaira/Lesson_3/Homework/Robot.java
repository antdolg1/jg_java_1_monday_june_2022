package main.java.students.student_Denis_Kaira.Lesson_3.Homework;

public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }
    
    public Robot() {
    }
    
    void sayNameIsRobo(){
        System.out.println("My name is " + this.name);
    }

    public static void sayHello(){
        System.out.println("Hello");
    }
}
