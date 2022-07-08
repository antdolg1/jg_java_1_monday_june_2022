package lesson_3.homework.level_1.task_6;

class Robot {
    String name;
    Robot(String roboName) {
        this.name = roboName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is: " + name);
    }
}
