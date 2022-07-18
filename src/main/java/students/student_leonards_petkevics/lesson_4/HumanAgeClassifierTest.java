package main.java.students.student_leonards_petkevics.lesson_4;

public class HumanAgeClassifierTest {
    public static void main(String[] args) {

        HumanAgeClassifierTest test = new HumanAgeClassifierTest();
        test.shouldClassifyBaby();
        test.shouldClassifyTeenager();
        test.shouldClassifyStudent();
        test.shouldClassifyDepressedPerson();
        test.shouldClassifyMonk();
        test.shouldClassifyPaladin();
    }
    void shouldClassifyBaby(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = 2;
        String expectedResult = "Baby";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify baby PASSED!");
        }
        else {
            System.out.println("Test should classify baby Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldClassifyTeenager(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = 14;
        String expectedResult = "Teenager";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify teenager PASSED!");
        }
        else {
            System.out.println("Test should classify teenager Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldClassifyStudent(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = 22;
        String expectedResult = "Student";

        String actualResult = victim.classify(age);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify student PASSED!");
        }
        else {
            System.out.println("Test should classify student Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldClassifyDepressedPerson(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = 42;
        String expectedResult = "Depressed person";

        String actualResult = victim.classify(age);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify DepressedPerson PASSED!");
        }
        else {
            System.out.println("Test should classify DepressedPerson Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldClassifyPaladin(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = -2;
        String expectedResult = "Paladin";

        String actualResult = victim.classify(age);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify Paladin PASSED!");
        }
        else {
            System.out.println("Test should classify Paladin Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldClassifyMonk(){
        HumanAgeClassifier victim = new HumanAgeClassifier();
        int age = 100;
        String expectedResult = "Monk";

        String actualResult = victim.classify(age);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test should classify Monk PASSED!");
        }
        else {
            System.out.println("Test should classify Monk Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}
