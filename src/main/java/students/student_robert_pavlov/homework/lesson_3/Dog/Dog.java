package main.java.students.student_robert_pavlov.homework.lesson_3.Dog;

public class Dog {

    String name;
    int age;
    String color;
     String newColor;

    public Dog(String Doggy, int age, String color){
        this.name = Doggy;
        this.age = age;
        this.color = color;

    }

    void voice(){System.out.println(" Doggy, Doggy, Doggy. " + "My color is" + color); }
        int happyBirthday() {
        int newAge = age + 1;
        return newAge;

    }
    void changeColor() {System.out.println("newColor:" + "black");
        this.newColor = "black";

    }
    void voice2(){
        System.out.println(" Doggy, Doggy, Doggy. "); }
}

