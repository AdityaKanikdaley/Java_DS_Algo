package apniKaksha.Recursion;

// Q: Matrix: flood fill : to change the numbers adjacent to the given numbers in a given matrix
public class matrix_flood_fill {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}
        };

        floodFill(a, 0, 0, 3, 1);
        printMatrix(a);
    }

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void floodFill(int[][] a, int r, int c, int toFill, int prevFill) {
        int rows = a.length;
        int cols = a[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols)  // to handle: going out of matrix
            return;  // in this case we won't do anything and just return

        if (a[r][c] != prevFill)  // to handle: what number to change condition
            return;  // in this case we won't do anything and just return

        a[r][c] = toFill; // fill the number with new number

        floodFill(a, r - 1, c, toFill, prevFill); // going up
        floodFill(a, r, c - 1, toFill, prevFill); // going left
        floodFill(a, r + 1, c, toFill, prevFill); // going down
        floodFill(a, r, c + 1, toFill, prevFill); // going right
    }
}
