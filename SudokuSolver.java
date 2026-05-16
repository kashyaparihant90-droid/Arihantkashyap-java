import java.util.Scanner;

public class SudokuSolver {

    static final int N = 9;

    static boolean isSafe(int[][] board, int row, int col, int num) {

        for(int i = 0; i < N; i++) {
            if(board[row][i] == num) return false;
        }

        for(int i = 0; i < N; i++) {
            if(board[i][col] == num) return false;
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[startRow + i][startCol + j] == num)
                    return false;
            }
        }

        return true;
    }

    static boolean solveSudoku(int[][] board) {

        for(int row = 0; row < N; row++) {
            for(int col = 0; col < N; col++) {

                if(board[row][col] == 0) {

                    for(int num = 1; num <= 9; num++) {

                        if(isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if(solveSudoku(board)) return true;

                            board[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    static void printBoard(int[][] board) {

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] board = new int[N][N];

        System.out.println("Enter Sudoku (use 0 for empty cells):");

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        if(solveSudoku(board)) {
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }

        sc.close();
    }
}