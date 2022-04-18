package apniKaksha.Patterns;

import java.util.Scanner;

//pattern:
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
public class pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i + 1; j++) { //spaces
                System.out.print(" "); // printing 1 space
            }
            for (int j = 1; j < number - i + 1; j++) { //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
