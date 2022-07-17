package main.java.students.student_leonards_petkevics.lesson_4.level_4;


public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger than second!");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second number is bigger than first!");
        } else {
            System.out.println("Numbers are even!");
        }
        return 1; //why do i need to return here ? and how to name it?
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber > secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        } else if (secondNumber > thirdNumber && thirdNumber == firstNumber) {
            return secondNumber;
        } else if (thirdNumber > secondNumber && secondNumber == firstNumber) {
            return secondNumber;
        } else {
            return secondNumber;
        }
    }
}
