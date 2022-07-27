package main.java.students.student_leonards_petkevics.lesson_6;

public class Robot {
    public String name;

    public String sayHello() {
        return "Hello";
    }

    public int maxOfTwoNumbers (int firstNumber, int secondNumber){
//        if (firstNumber > secondNumber){
//            return firstNumber;
//        }else {
//            return secondNumber;
//        }
//
        return Math.max(firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber){
        int maxOfFirstTwoNumbers = Math.max(firstNumber, secondNumber);
        return Math.max(maxOfFirstTwoNumbers, thirdNumber);
    }

}
