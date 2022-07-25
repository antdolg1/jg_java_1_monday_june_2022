package main.java.teacher.lesson_6.lessoncode;

public class Robot {

    public String name;

    public String sayHello() {
        return "Hello";
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

//        if (firstNumber > secondNumber) {
//            return firstNumber;
//        } else {
//            return secondNumber;
//        }

        return Math.max(firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
            int maxOfFirstTwoNumbers = Math.max(firstNumber, secondNumber);
        Math.min(2, 4);
        return Math.max(maxOfFirstTwoNumbers, thirdNumber);
    }

}
