package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int sumRow=0;
        int sumCol=0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                for(int j =0;j<board.length;j++){
                    sumCol=sumCol+board[i][j];
                    sumRow=sumRow+board[j][i];
                }
                if(sumCol==5||sumRow==5){
                    rsl=true;
                }
                sumCol=sumRow=0;
            }
        }
        return rsl;
    }

    public static boolean checkLine(int[] line) {
        boolean rsl = true;
        for (int a : line) {
            if (a != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
