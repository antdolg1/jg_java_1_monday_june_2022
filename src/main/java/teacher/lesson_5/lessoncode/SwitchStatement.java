package main.java.teacher.lesson_5.lessoncode;

public class SwitchStatement {

    public static void main(String[] args) {

//        int level = 1;
//
//        if (level == 1) {
//            System.out.println("Beginner");
//        }
//
//        if (level == 2) {
//            System.out.println("Intermediate");
//        }
//
//        if (level == 3) {
//            System.out.println("Advanced");
//        }
//
//        if (level == 4) {
//            System.out.println("Professional");
//        }

        String levelString = "Intermediate";
        int level;

        switch (levelString) {
            case "Beginner":
                level = 1;
                break;

            case "Intermediate":
                level = 2;
                break;

            case "Advanced":
                level = 3;
                break;

            case "Pro":
                level = 4;
                break;

            default:
                level = 0;
                break;
        }

        System.out.println("Your level is: " + level);



    }

}
