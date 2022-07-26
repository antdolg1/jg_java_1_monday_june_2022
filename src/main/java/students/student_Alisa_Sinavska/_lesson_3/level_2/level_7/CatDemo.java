package main.java.students.student_alisa_sinavska._lesson_3.level_2.level_7;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat("Misha");

        System.out.println("come here " + cat.name);

        cat.speak();
        System.out.println("" +
                "" +
                "" +
                " "); // строку пропустить можно только так или есть по красивее способ?

        cat.name = "Vasja";
        System.out.println("what are you doing " + cat.name + "?");
        cat.sleep();

    }
}
