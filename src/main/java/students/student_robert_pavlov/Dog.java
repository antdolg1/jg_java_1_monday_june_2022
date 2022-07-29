package main.java.students.student_robert_pavlov;

public class Dog {

    int age;
    String name;
    int height;

    public Dog () {

    }

    public Dog (int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    void speak(){System.out.println("Woof woof woof!"); }
    void greetings () {
        System.out.println("Hello");
        speak();
    }
    int yearsAfterTwoYears() {
        int newAge = age + 2;

        return newAge;
    }
}
