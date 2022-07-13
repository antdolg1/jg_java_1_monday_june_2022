package main.java.students.student_alisa_sinavska.lesson_4.homework.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfTwoNumbers3();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
        calculatorTest.maxOfThreeNumbers7();
        calculatorTest.maxOfThreeNumbers8();
        calculatorTest.maxOfThreeNumbers9();
        calculatorTest.maxOfThreeNumbers10();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void difTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.dif(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Dif test = OK");
        } else {
            System.out.println("Dif test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEven() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        Boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FALSE");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        String expectedResult = "Max of two numbers is 10"; //не понимаю как правильно это записать чтобы не был провален тест
        Calculator calculator = new Calculator();
        String realResult = String.valueOf(calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 1;
        int secondNumber = 5;
        String expectedResult = "Max of two numbers is " + secondNumber; //не понимаю как правильно это записать чтобы не был провален тест
        Calculator calculator = new Calculator();
        String realResult = String.valueOf(calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test 2 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test 2 = FAIL");
        }
    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 10;
        int secondNumber = 10;
        String expectedResult = "numbers are equals";
        Calculator calculator = new Calculator();
        String realResult = String.valueOf(calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test 3 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test 3 = FAIL");
        }
    }

    public void maxOfThreeNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test = OK");
        } else {
            System.out.println("MaxOfThree = FAIL");
        }
    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 2;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 2 = OK");
        } else {
            System.out.println("MaxOfThree 2 = FAIL");
        }
    }
    public void maxOfThreeNumbers3() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 22;
        int expectedResult = 22;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 3 = OK");
        } else {
            System.out.println("MaxOfThree 3 = FAIL");
        }
    }
    public void maxOfThreeNumbers4() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 4 = OK");
        } else {
            System.out.println("MaxOfThree 4 = FAIL");
        }
    }
    public void maxOfThreeNumbers5() {
        int firstNumber = 13;
        int secondNumber = 2;
        int thirdNumber = 13;
        int expectedResult = 13;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 5 = OK");
        } else {
            System.out.println("MaxOfThree 5 = FAIL");
        }
    }
    public void maxOfThreeNumbers6() {
        int firstNumber = 13;
        int secondNumber = 2;
        int thirdNumber = 2;
        int expectedResult = 13;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 6 = OK");
        } else {
            System.out.println("MaxOfThree 6 = FAIL");
        }
    }
    public void maxOfThreeNumbers7() {
        int firstNumber = 13;
        int secondNumber = 22;
        int thirdNumber = 22;
        int expectedResult = 22;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 7 = OK");
        } else {
            System.out.println("MaxOfThree 7 = FAIL");
        }
    }
    public void maxOfThreeNumbers8() {
        int firstNumber = 11;
        int secondNumber = 23;
        int thirdNumber = 11;
        int expectedResult = 23;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 8 = OK");
        } else {
            System.out.println("MaxOfThree 8 = FAIL");
        }
    }
    public void maxOfThreeNumbers9() {
        int firstNumber = 23;
        int secondNumber = 23;
        int thirdNumber = 111;
        int expectedResult = 111;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 9 = OK");
        } else {
            System.out.println("MaxOfThree 9 = FAIL");
        }
    }
    public void maxOfThreeNumbers10() {
        int firstNumber = 233;
        int secondNumber = 233;
        int thirdNumber = 233;
        int expectedResult = 233;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThree test 10 = OK");
        } else {
            System.out.println("MaxOfThree 10 = FAIL");
        }
    }

}


