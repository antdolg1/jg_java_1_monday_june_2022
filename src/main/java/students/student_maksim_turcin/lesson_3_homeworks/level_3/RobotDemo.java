package main.java.students.student_maksim_turcin.lesson_3_homeworks.level_3;

public class RobotDemo {
    public RobotDemo() {
    }

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Madrid");
        robot3.sayHello();
        robot3.sayYourName();

        Robot robot4 = new Robot("Pano-Pepe");
        robot4.sayHello();
        robot4.sayYourName();
    }
}
