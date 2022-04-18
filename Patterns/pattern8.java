package apniKaksha.Patterns;

import java.util.Scanner;

// pattern:
//                      *
//                    *   *
//                  *   *   *
//                *   *   *   *
//              *   *   *   *   *

//for spaces: in ith row = 2(n-1) single space( ) OR (n-1) double space(  )
//for stars: in ith row = (*) stars with 3 spaces printing

public class pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= (number - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}
