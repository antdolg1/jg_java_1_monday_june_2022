package main.java.students.student_leonards_petkevics.lesson_3.homework.level_7;

 class CarDemo {
  public static void main(String[] args) {
   Car myCar = new Car();
   Car yourCar = new Car("Skoda", 1.9, 165);
   myCar.horn();
   myCar.engineOnOrOff();
   myCar.carIsDriving();
   System.out.println(yourCar.carBrand + ". Engine size: " + yourCar.engineSize + " Car height: " + yourCar.height);
  }
}
