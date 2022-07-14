package main.java.students.student_leonards_petkevics.lesson_3.homework.level_5;

 class DogDemo {
    public static void main(String[] args) {

        Dog dogOne = new Dog("Charl");
        dogOne.voice();
        Dog dogTwo = new Dog("John", 2);
        dogTwo.voiceTwo();
        dogTwo.happyBitrhday();
        Dog dogThree = new Dog("Barbara", 4, "Red");
        dogThree.voiceThree();
        dogThree.changeColor("Black");
    }
}
