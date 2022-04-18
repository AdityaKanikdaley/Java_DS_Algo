package apniKaksha.Patterns;

import java.util.Scanner;

//  pattern:
//        *
//        * *
//        *   *
//        *     *
//        * * * * *

// upper part = only 1 star
// middle part runs from row 2 till (n-1) row
// middle part contains only 2 stars in each row
// middle part = star -> (i-2) spaces -> star
// lower part = (n) stars

public class pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

        System.out.println("* ");  // 1st row


        for (int i = 2; i <= number - 1; i++) { //middle part

            System.out.print("* "); //1st star

            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  "); //(n-2) spaces
            }
            System.out.print("* "); //2nd star

            System.out.println();

        }


        if (number > 1) {
            for (int i = 1; i <= number; i++) { // last row
                System.out.print("* ");
            }
        }
    }
}
