// package apniKaksha.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class zig_zag_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int r = 3;
        int c = 3;

        System.out.println("Array:");
        for(int[] row : arr)
            System.out.println(Arrays.toString(row));

        int sum = 0;
        for (int j = 0; j < c; j++) {
            sum = sum + arr[0][j] + arr[r - 1][j];
        }
        for (int i = 1, j = c - 2; i < r - 1 && j > 0; i++, j--) {
            sum = sum + arr[i][j];
        }
        System.out.println("Sum of Zig-Zag pattern is: " + sum);

        sc.close();
    }
}
