package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_4;

class Calculator { //15 доделать

    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {

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
            return "Max is " + firstNumber;
        } else if (firstNumber < secondNumber) {
            return "Max is " + secondNumber;
        } else  {
            return "equal";
        }
    }
}


