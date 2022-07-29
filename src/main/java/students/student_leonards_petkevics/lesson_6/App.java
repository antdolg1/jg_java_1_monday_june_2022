package main.java.students.student_leonards_petkevics.lesson_6;

class Thing {

        public String name;
        public static String description;
        public void showName(){
            System.out.println(name);
        }

        public static void showDescription() {
            System.out.println(description);
        }

    }

    public class App {
        public static void main(String[] args) {

            Thing.description = "I am the thing";
            Thing.showDescription();

            Thing thing1 = new Thing();
            Thing thing2 = new Thing();

            thing1.name = "Bob";
            thing2.name = "Sarah";

            thing1.showName();
            thing2.showName();

        }

    }

