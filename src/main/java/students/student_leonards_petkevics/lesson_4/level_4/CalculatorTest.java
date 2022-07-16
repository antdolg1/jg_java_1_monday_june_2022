package main.java.students.student_leonards_petkevics.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divideTest();
        calculatorTest.multiplicationTest();
        calculatorTest.subtractionTest();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfFirstNumbers();
        calculatorTest.maxOfThirdNumber();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbersTwo();
        calculatorTest.maxOfThreeNumbersThree();
        calculatorTest.maxOfThreeNumbersFour();
        calculatorTest.maxOfThreeNumbersFive();
        calculatorTest.maxOfThreeNumbersSix();
        calculatorTest.maxOfThreeNumbersSeven();
        calculatorTest.maxOfThreeNumbersEight();
        calculatorTest.maxOfThreeNumbersNine();
        calculatorTest.maxOfThreeNumbersTen();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        }
        else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        }
        else {
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        }
        else {
            System.out.println("Divide test = FAIL");
        }
    }
    void isEven(){
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        Boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FALSE");
        }
    }
    void maxOfTwoNumbers(){
        int firstNumber = 2;
        int secondNumber = 1;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers - test ok!");
        }
        else {
            System.out.println("Max of two numbers - test fail!");
        }
    }
    void maxOfFirstNumbers(){
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Max of two numbers - test ok!");
        }
        else {
            System.out.println("Max of two numbers - test fail!");
        }
//       I dont understand why it shows fail on the second test!
    }
    void maxOfThirdNumber(){
        int firstNumber = 1;
        int secondNumber = 1;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(1, 1);
        if (realResult == expectedResult){
            System.out.println("Max of two numbers - test ok!");
        }
        else {
            System.out.println("Max of two numbers - test fail!");
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

    public void maxOfThreeNumbersTwo() {
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
    public void maxOfThreeNumbersThree() {
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
    public void maxOfThreeNumbersFour() {
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
    public void maxOfThreeNumbersFive() {
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
    public void maxOfThreeNumbersSix() {
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
    public void maxOfThreeNumbersSeven() {
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
    public void maxOfThreeNumbersEight() {
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
    public void maxOfThreeNumbersNine() {
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
    public void maxOfThreeNumbersTen() {
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

