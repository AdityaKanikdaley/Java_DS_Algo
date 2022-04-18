package apniKaksha.MISC;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int reversed_number = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed_number = reversed_number * 10 + lastDigit;
            temp /= 10;
        }

        if (reversed_number == number)
            System.out.println(number + " is palindrome!");
        else
            System.out.println(number + " is not palindrome!");

    }
}
