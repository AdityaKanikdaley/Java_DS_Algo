package apniKaksha.MISC;

import java.util.Scanner;

public class number_of_digits {
    public static void main(String[] args) {
        // to find digits in a number:
        // suppose number = 542, then digits = log(base10) (n) + 1

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // method 1
//        int number_of_digits = (int) Math.log10(number) + 1;
//        System.out.println("Number of digits: " + number_of_digits);

        // method 2
        int number_of_digits = 0;

        if (number == 0) {
            number_of_digits = 1;
        } else {
            while (number != 0) {
                int temp = number % 10;
                number_of_digits++;
                number /= 10;
            }
        }
        System.out.println("Number of digits: " + number_of_digits);
    }
}
