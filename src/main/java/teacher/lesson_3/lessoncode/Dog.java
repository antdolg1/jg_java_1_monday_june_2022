package main.java.teacher.lesson_3.lessoncode;

class Dog {

// 1. Данные (Data, state, поля)

    int age;
    String name;
    int height;

    public Dog() {

    }

    public Dog(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

// 2. Поведение (подпрограммы, methods)

    void speak() {
        System.out.println("Woof woof woof!");
    }

    void greetings() {
        System.out.println("Hello");
        speak();
    }

    int yearsAfterTwoYears() {
        int newAge = age + 2;

        return newAge;
    }

}


