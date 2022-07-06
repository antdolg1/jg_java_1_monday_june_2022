package lesson_3.homework.level_1.task_6;

class Robot {
    String name;
    Robot(String roboName) {
        this.name = roboName;
    }
    void sayHello() {
        System.out.println("Hello");
    }
    void sayYourName() {
        System.out.println("My name is: " + name);
    }
}
