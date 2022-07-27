package main.java.students.student_leonards_petkevics.lesson_6;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] values = {1, 22, 333, 4444};
        System.out.println("Last element of array values " + values[3]);

        int[][] grid = {
                {1, 22, 333, 4444},
                {2, 55},
                {44, 5555, 222},
                {2}

        };

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[0].length; j++){
                if((i +j) % 2 == 0){
                    chessBoard[i][j] = "\u25A1";
                }
                else {
                    chessBoard[i][j] = "\u25A0";
                }
            }
        }



        System.out.println(grid[0][1]);
        System.out.println(grid[3][0]);
        System.out.println(grid[2][1]);

        String[] testArray = new String[3];
        testArray[0] = "text 1";
        testArray[1] = "text 2";
        testArray[2] = "text 3";

        String[][] texts = new String[3][3];
        texts[2][2] = "Some text!";
        System.out.println(texts[2][2]);
        System.out.println(texts[2][1]);

    }
}
