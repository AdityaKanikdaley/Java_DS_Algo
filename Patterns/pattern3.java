package apniKaksha.Patterns;

import java.util.Scanner;

//    pattern:
//        *
//        * *
//        * * *
//        * * * *
public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How big pattern? ");
        int number = scanner.nextInt();

//        my way:
//        for (int i =0; i<number; i++){
//            for(int j = 0; j< i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // his way
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
