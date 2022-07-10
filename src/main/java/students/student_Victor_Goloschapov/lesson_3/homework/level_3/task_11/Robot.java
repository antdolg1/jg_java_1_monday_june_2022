package lesson_3.homework.level_3.task_11;

class Robot {
    String name;
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is: " + this.name);
    }
}
