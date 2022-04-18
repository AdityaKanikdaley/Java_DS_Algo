package apniKaksha.Patterns;

import java.util.Scanner;

// pattern:
//                      1
//                    2   3
//                  4   5   6
//                7   8   9   10
//              11   12   13   14   15

//for spaces: in ith row = 2(n-1) single space( ) OR (n-1) double space(  )
//for stars: in ith row = (i) stars with 3 spaces printing
public class pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();
        int output = 1;
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= (number - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(output++ + "   ");
            }

            System.out.println();
        }
    }
}
