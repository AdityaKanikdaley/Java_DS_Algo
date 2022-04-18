package apniKaksha.Patterns;

import java.util.Scanner;

// pattern:
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

//for total rows to print = 2 * n - 1
//for upper part = star = (i) times
//for lower part = star = (rows - i + 1) times

public class pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

        int rows = 2 * number - 1;

        for (int i = 1; i <= rows; i++) {

            if (i <= number) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
