package main.java.students.student_maksim_turcin.lesson_3_homeworks.level_4;

class Phone {

    String model;

        Phone(String newModel) {  //Book поменял на телефон
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
