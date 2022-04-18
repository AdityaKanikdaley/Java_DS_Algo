package apniKaksha.Patterns;

import java.util.Scanner;

//    pattern: (nxn)
//        * * * *
//        * * * *
//        * * * *
//        * * * *
public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How big pattern? ");

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
