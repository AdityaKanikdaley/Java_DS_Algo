package apniKaksha.MISC;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {

        System.out.print("Enter number to sum: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            // for number = 435
            int lastDigit = temp % 10; // 5, 3, 4
            temp /= 10; // 43, 4, 0
            sum += lastDigit; // 5 + 3 + 4
            System.out.println("lastDigit: " + lastDigit + " temp: " + temp + " sum: " + sum);
        }
        System.out.println("Sum of " + number + " is: " + sum);
    }
}
