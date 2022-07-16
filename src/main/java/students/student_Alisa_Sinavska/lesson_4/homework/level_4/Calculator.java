package main.java.students.student_alisa_sinavska.lesson_4.homework.level_4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return "Max of two numbers is " + firstNumber;
        } else if (secondNumber > firstNumber) {
            return "Max of two numbers is " + secondNumber;
        } else {
            return "numbers are equal";
        }
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
            return thirdNumber;
        } else if (secondNumber == firstNumber && firstNumber == thirdNumber) {
        }
        return firstNumber;
    }
}



