package main.java.students.student_leonards_petkevics.lesson_3.homework.level_1;

class Robot {

    String name;

    public Robot() {

    }
    Robot(String robotName){
        this.name = robotName;
    }
    void sayHello(){
        System.out.println("Hello!");
    }

    void sayName(){
        System.out.println("My name is " + this.name);
    }

}

