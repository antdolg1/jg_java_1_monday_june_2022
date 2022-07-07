package main.java.students.student_Edik_Gerasimchuk.Lesson_3;

class Dog {

    // 1. Данные (Data,state,поля)

    int age;
    String name;
    int height;
    String color;
    public Dog(){

    }


    public Dog(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;

    }

    void speak() {
        System.out.println("Woof woof woof!");
    }

    void greetings(){
        System.out.println("Hello my name is: " + name);
    }

    int yearsAfterTwoYears(){
        int newAge = age + 2;
        return newAge;
    }

    }


    // 2. Поведение (Подпрограммы,methods)




