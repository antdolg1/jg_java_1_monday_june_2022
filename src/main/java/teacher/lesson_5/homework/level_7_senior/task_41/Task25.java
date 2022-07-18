package main.java.teacher.lesson_5.homework.level_7_senior.task_41;

public class Task25 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthFromUser();
		int [] array =  arrayUtil.newArray(arrayLength);
		arrayUtil.fillArray(array);
		arrayUtil.printArray(array);
	}

}
