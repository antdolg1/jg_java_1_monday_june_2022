package lesson_3.homework.level_3.task_13;

class Robot {
    String name;
    public Robot(String roboName) {
        this.name = roboName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is: " + name);
    }
}
