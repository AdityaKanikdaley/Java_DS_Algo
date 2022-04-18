package apniKaksha.MISC;

public class sum_prime_till_n {

    static boolean isPrime(int j) {
        if (j == 1)
            return false;

        for (int i = 2; i * i <= j; i++)
            if (j % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) // didn't take i=0 is as adding 0 is 0 itself
            if (isPrime(i)) {
                System.out.println(i);
                sum += i;
            }

        System.out.println("Sum of prime till " + n + " is: " + sum);
    }
}
