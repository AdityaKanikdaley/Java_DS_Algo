package apniKaksha.Recursion;

import java.util.Scanner;

// Q: find sum of first N natural numbers using recursion
public class sum_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sum(number));
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}
