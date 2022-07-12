package main.java.students.student_leonards_petkevics.lesson_3.homework.level_5;

 class Dog {
    String name;
    int age;
    String color;
    String newColor;


    public Dog(){

    }

    public Dog(String name){
        this.name = name;

    }

    void voice(){
        System.out.println(name + " " + name + " " + name + "!");
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    void voiceTwo(){
        System.out.println(name + ". " + age + " years!");
    }

    void happyBitrhday(){
        System.out.println(age +1);
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void voiceThree(){
        System.out.println(name + " " + age + " " + color + "!");
    }
    void changeColor(String newColor){
        this.color = newColor;
        System.out.println(name + " " + age + " " + newColor + "!");
    }
}
