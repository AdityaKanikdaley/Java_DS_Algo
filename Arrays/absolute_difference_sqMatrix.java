package apniKaksha.Arrays;

public class absolute_difference_sqMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        System.out.println("Abs diff: " + solve(matrix));
    }

    private static int solve(int[][] matrix) {

        int leftD = 0, rightD = 0, counter = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            leftD += matrix[i][i];
            rightD += matrix[i][counter];
            counter--;
        }

        System.out.println("leftD: " + leftD);
        System.out.println("rightD: " + rightD);

        return Math.abs(leftD - rightD);
    }
}
