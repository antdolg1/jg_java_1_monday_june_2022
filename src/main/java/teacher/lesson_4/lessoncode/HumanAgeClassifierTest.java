package main.java.teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {


        HumanAgeClassifierTest test = new HumanAgeClassifierTest();

        test.shouldClassifyBaby();
        test.shouldClassifyTeenager();
        test.shouldClassifyStudent();
        test.shouldClassifyDepressedPerson();

//Testing by hand:

//        HumanAgeClassifier classifier = new HumanAgeClassifier();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter age: ");
//        int age = scanner.nextInt();
//
//        String result = classifier.classify(age);
//        System.out.println("Result: " + result);

    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 2;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyBaby PASSED!");
        } else {
            System.out.println("Test shouldClassifyBaby FAILED!");
            System.out.println("Expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }

    void shouldClassifyTeenager() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 14;
        String expectedResult = "Teenager";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyTeenager PASSED!");
        } else {
            System.out.println("Test shouldClassifyTeenager FAILED!");
            System.out.println("Expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }

    void shouldClassifyStudent() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 14;
        String expectedResult = "Teenager";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyStudent PASSED!");
        } else {
            System.out.println("Test shouldClassifyStudent FAILED!");
            System.out.println("Expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }

    void shouldClassifyDepressedPerson() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 40;
        String expectedResult = "Depressed person";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test shouldClassifyDepressedPerson PASSED!");
        } else {
            System.out.println("Test shouldClassifyDepressedPerson FAILED!");
            System.out.println("Expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }

}


