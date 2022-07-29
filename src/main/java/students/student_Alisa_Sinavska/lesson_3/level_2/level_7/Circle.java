package main.java.students.student_Alisa_Sinavska.lesson_3.level_2.level_7;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(final double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println(radius * Math.PI);
    }
}
