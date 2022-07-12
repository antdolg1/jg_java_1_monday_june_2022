package main.java.students.student_maksim_turcin.lesson_3_homeworks.level_3;

 public class Robot {

     public Robot() {

     }

     public void sayHello() {
         System.out.println("Hello!");
     }

     public void sayYourName() {
         System.out.println("My name is " + nameRobot);
     }

     String nameRobot;

     public Robot(String nameRobot) {
         this.nameRobot = nameRobot; //робот запоминает в свойстве this.name как его зовут
     }
 }

