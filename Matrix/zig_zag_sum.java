// package apniKaksha.Matrix;

import java.util.Scanner;

public class zig_zag_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int j = 0; j < c; j++) {
            sum = sum + arr[0][j] + arr[r - 1][j];
        }
        for (int i = 1, j = c - 2; i < r - 1 && j > 0; i++, j--) {
            sum = sum + arr[i][j];
        }
        System.out.println("Sum of Zig-Zag pattern is: " + sum);
    }
}
