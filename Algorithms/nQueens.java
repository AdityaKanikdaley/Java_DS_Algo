// refer for ALL POSSIBLE SOLUTIONS OF nQUEENS: https://java.achchuthan.org/2012/02/n-queens-problem-in-java.html
// refer for ALL POSSIBLE SOLUTIONS OF nQUEENS: https://pencilprogrammer.com/algorithms/n-queen-problem/
// refer for ALL POSSIBLE SOLUTIONS OF nQUEENS: https://www.youtube.com/watch?v=bRs6E_SL2Tk
// refer for SINGLE SOLUTION: https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/

import java.util.ArrayList;
import java.util.List;

//apna college approach for printing ALL POSSIBLE SOLUTIONS OF nQUEENS
public  class nQueens {

    public static boolean isSafe(int row, int col, char[][] board){

        //horizontal
        for (int j=0; j<board.length; j++)
            if (board[row][j] == 'Q')
                return false;

        //vertical
        for (int i=0; i<board[0].length; i++)
            if (board[i][col] == 'Q')
                return false;

        //upper left
        int r = row;
        for (int c=col; c>=0 && r>=0; c--, r--)
            if (board[r][c] == 'Q')
                return false;

        //upper right
        r = row;
        for (int c=col; c<board.length && r>=0; r--, c++)
            if (board[r][c] == 'Q')
                return false;

        //lower left
        r = row;
        for (int c=col; c>=0 && r<board.length; r++, c--)
            if (board[r][c] == 'Q')
                return false;

        //lower right
        for (int c=col; c<board.length && r<board.length; c++, r++)
            if (board[r][c] == 'Q')
                return false;

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row;
        List<String> newBoard = new ArrayList<>();

        for (int i=0; i<board.length; i++){
            row = "";
            for (int j=0; j< board[0].length; j++){
                if (board[i][j] =='Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for (int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}

// GFG approach for printing SINGLE SOLUTION

//public class nQueens {
//    final int N = 6;
//
//    /* A utility function to print solution */
//    void printSolution(int[][] board) {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++)
//                System.out.print(" " + board[i][j]
//                        + " ");
//            System.out.println();
//        }
//    }
//
//    /* A utility function to check if a queen can
//       be placed on board[row][col]. Note that this
//       function is called when "col" queens are already
//       placed in columns from 0 to col -1. So we need
//       to check only left side for attacking queens */
//    boolean isSafe(int[][] board, int row, int col) {
//        int i, j;
//
//        /* Check this row on left side */
//        for (i = 0; i < col; i++)
//            if (board[row][i] == 1)
//                return false;
//
//        /* Check upper diagonal on left side */
//        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
//            if (board[i][j] == 1)
//                return false;
//
//        /* Check lower diagonal on left side */
//        for (i = row, j = col; j >= 0 && i < N; i++, j--)
//            if (board[i][j] == 1)
//                return false;
//
//        return true;
//    }
//
//    /* A recursive utility function to solve N
//       Queen problem */
//    boolean solveNQUtil(int[][] board, int col) {
//        /* base case: If all queens are placed
//           then return true */
//        if (col >= N)
//            return true;
//
//        /* Consider this column and try placing
//           this queen in all rows one by one */
//        for (int i = 0; i < N; i++) {
//            /* Check if the queen can be placed on
//               board[i][col] */
//            if (isSafe(board, i, col)) {
//                /* Place this queen in board[i][col] */
//                board[i][col] = 1;
//
//                /* recur to place rest of the queens */
//                if (solveNQUtil(board, col + 1))
//                    return true;
//
//                /* If placing queen in board[i][col]
//                   doesn't lead to a solution then
//                   remove queen from board[i][col] */
//                board[i][col] = 0; // BACKTRACK
//            }
//        }
//
//        /* If the queen can not be placed in any row in
//           this colum col, then return false */
//        return false;
//    }
//
//    /* This function solves the N Queen problem using
//       Backtracking.  It mainly uses solveNQUtil () to
//       solve the problem. It returns false if queens
//       cannot be placed, otherwise, return true and
//       prints placement of queens in the form of 1s.
//       Please note that there may be more than one
//       solution, this function prints one of the
//       feasible solutions.*/
//    void solveNQ() {
//
//        int[][] board = new int[N][N]; // dynamic 2D chess board based on N
//        // by default all values in array are set to be 0
//
//        if (!solveNQUtil(board, 0)) {
//            System.out.print("Solution does not exist");
//            return;
//        }
//
//        printSolution(board);
//    }
//
//    // driver program to test above function
//    public static void main(String[] args) {
//        nQueens Queen = new nQueens();
//        Queen.solveNQ();
//    }
//}
