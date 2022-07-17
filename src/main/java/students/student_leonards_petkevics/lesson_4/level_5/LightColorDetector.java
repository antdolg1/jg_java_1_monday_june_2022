package main.java.students.student_leonards_petkevics.lesson_4.level_5;

public class LightColorDetector {
//    public String detect(int waveLength){
//        detect(123);
//    }


    public static void main(String[] args) {
        LightColorDetector test = new LightColorDetector();
        test.shouldBePurple();
        test.shouldBeBlue();
        test.shouldBeGreen();
        test.shouldBeYellow();
        test.shouldBeOrange();
        test.shouldBeRed();
    }
    void shouldBePurple(){
        LightColor purple = new LightColor();
        int waveLength = 410;
        String expectedResult = "Violet";
        String actualResult = purple.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeBlue(){
        LightColor blue = new LightColor();
        int waveLength = 470;
        String expectedResult = "Blue";
        String actualResult = blue.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeGreen(){
        LightColor green = new LightColor();
        int waveLength = 560;
        String expectedResult = "Green";
        String actualResult = green.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeYellow(){
        LightColor yellow = new LightColor();
        int waveLength = 572;
        String expectedResult = "Yellow";
        String actualResult = yellow.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeOrange(){
        LightColor orange = new LightColor();
        int waveLength = 610;
        String expectedResult = "Orange";
        String actualResult = orange.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeRed(){
        LightColor red = new LightColor();
        int waveLength = 630;
        String expectedResult = "Red";
        String actualResult = red.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
    void shouldBeInvisibleLight(){
        LightColor invisible = new LightColor();
        int waveLength = 60;
        String expectedResult = "Invisible light";
        String actualResult = invisible.wave(waveLength);
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test  Failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}
