import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void main(String[] args) {

        int n = 20; // tell primes till 20
        boolean[] isPrime = s_o_e(n);
        for (int i = 0; i <= 20; i++)
            System.out.println(i + " " + isPrime[i]);
    }

    private static boolean[] s_o_e(int n) {

        // making array for n+1 to avoid using (n-1) further
        boolean[] isPrime = new boolean[n + 1];

        // fill all values byDefault true
        Arrays.fill(isPrime, true);

        // make 0th index as false as its extra due to (n+1)
        // make 1st index as false as 1st index = 1 = not prime
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) { // iterate from 2 to root(n)
            for (int j = 2 * i; j <= n; j += i) { // iterate 2nd multiples and make it false
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
