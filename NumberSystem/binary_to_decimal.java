package apniKaksha.NumberSystem;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();  // took long because binary can be big like 1100000001111
        int sum = 0;
        int i = 0;
        while (number > 0) {
            int lastDigit = (int) (number % 10);  // convert lastDigit to int as last digit no need for long
            sum = (int) (sum + (lastDigit * (Math.pow(2, i++))));
            number /= 10;
        }
        System.out.println(sum);
    }
}
