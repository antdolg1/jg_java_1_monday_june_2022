package main.java.students.student_maksim_turcin.lesson_3_homeworks.level_4;

class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle; //Book запоминает Title в свойстве this.title
    }                           // изменил new на book

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
