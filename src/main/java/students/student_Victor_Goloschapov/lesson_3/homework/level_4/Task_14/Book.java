package lesson_3.homework.level_4.Task_14;

class Book {
    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

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
/*Решение
1. добавил точку с запятой после объявления переменной title, чтобы закрыть инструкцию
2. переменной title присваиваем значение аргумента функции bookTitle
3. я так понимаю, что в методе getTitle() можно вернуть значение "return this.title" или "return title"
 */