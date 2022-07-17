package main.java.students.student_Edik_Gerasimchuk.Lesson_4;

public class HumanAgeClassifierTest {

    public static void main(String[] args) {

        HumanAgeClassifierTest test = new HumanAgeClassifierTest();

        test.shouldClassifyBaby();


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
            System.out.println("Expected result: " + expectedResult + "actual result: " + actualResult);
        }


    }


}
