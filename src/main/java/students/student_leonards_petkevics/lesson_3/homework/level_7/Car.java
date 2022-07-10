package main.java.students.student_leonards_petkevics.lesson_3.homework.level_7;

class Car {
    int height;
    double engineSize;
    String carBrand;
    boolean engine;
    boolean driving;

    public Car() {
    }

    public Car(String carBrand, double engineSize, int height) {
        this.height = height;
        this.carBrand = carBrand;
        this.engineSize = engineSize;
    }
    void horn(){
        System.out.println("Beeeep!");
    }
    void engineOnOrOff(){
        this.engine = !engine;
        System.out.println("Engine is on");
    }
    void carIsDriving(){
        this.driving = !driving;
        System.out.println("Car is moveing forward");
    }

}
