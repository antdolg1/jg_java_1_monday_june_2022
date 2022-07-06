package main.java.students.student_leonards_petkevics.lesson_3;

public class Dog {

    // Data, state,

    int age;
    String name;
    int height;
    String color;

    public Dog() {
    }

    public Dog(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    void speak() {
        System.out.println("woof woof wooof!");

    }

    void greeting (){
        System.out.println("Hello my name is: " + name);
    }

    int yearsAfterTwoYears(){

        return age + 2;

    }

}


