package main.java.students.student_alisa_sinavska._lesson_3.level_2.level_7;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        String name = "Misha";
        //пыталась сделать так, что в классе Cat: public Cat(name), а в CatDemo имя писать в Cat cat = new Cat(Misha), но тогда при таком же system.ot.. не работает. Почему?

        System.out.println("come here " + name);

        cat.speak();
        System.out.println("" +
                "" +
                "" +
                " "); // строку пропустить можно только так или есть по красивее способ?

        String name2 = "Vasja";
        System.out.println("what are you doing " + name2 + "?");
        cat.sleep();

    }
}
