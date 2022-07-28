package main.java.students.student_maksim_turcin.lesson_4_homeworks.level_4;

class CalculatorTest { //15 доделать

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
    }

    void sumTest() {
        int firstNumber = 15;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 20;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subTest() {
        int firstNumber = 15;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void mulTest() {
        int firstNumber = 15;
        int secondNumber = 5;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    void divTest() {
        int firstNumber = 15;
        int secondNumber = 5;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test is TRUE");
        } else {
            System.out.println("isEven test is FALSE");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 15;
        int secondNumber = 5;
        String expectedResult = "Max is " + 15;
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("maxOfTwoNumbersTest1 is OK");
        } else {
            System.out.println("maxOfTwoNumbersTest1 is FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 15;
        int secondNumber = 25;
        String expectedResult = "Max is " + 25;
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("maxOfTwoNumbersTest2 is OK");
        } else {
            System.out.println("maxOfTwoNumbersTest2 is FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 1;
        String expectedResult = "equal";
        Calculator calculator = new Calculator();
        String realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("maxOfTwoNumbersTest3 is OK");
        } else {
            System.out.println("maxOfTwoNumbersTest3 is FAIL");
        }
    }
}
 // убрал  empty lines










