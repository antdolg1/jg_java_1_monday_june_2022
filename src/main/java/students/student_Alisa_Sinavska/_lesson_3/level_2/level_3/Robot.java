package main.java.students.student_alisa_sinavska._lesson_3.level_2.level_3;

public class Robot {
    String robotName;

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.robotName); // я сделала по примеру вашего задания,
        // но у меня работало если и написать без"this" т.е. просто robotName. В чем разница?
    }
}
