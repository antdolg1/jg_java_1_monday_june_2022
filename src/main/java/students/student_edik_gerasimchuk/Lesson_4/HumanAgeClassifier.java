package main.java.students.student_Edik_Gerasimchuk.Lesson_4;

public class HumanAgeClassifier {

    public String classify(int age) {
        if (age > 0 && age <= 10) {
            return "Baby";
        } else if (age > 10 && age <= 17) {
            return "Tenager";
        } else if (age > 17 && age <= 25) {
            return "Student";
        } else if (age > 25 && age <= 65) {
            return "Depressed person";
        } else if (age > 65 && age <= 190) {
            return "Monk";
        } else {
            return "Paladin";
        }
    }
}
