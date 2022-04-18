package apniKaksha.Patterns;

import java.util.Scanner;

//pattern:
//            *
//          * *
//        * * *
//      * * * *

//for spaces: in ith row = 2(i-1) single space( ) OR (i-1) double space(  )
//for stars: in ith row = (i) stars printing

public class pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) { //spaces
                System.out.print("  "); // printing 2 spaces
            }
            for (int j = 1; j <= i; j++) { //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
