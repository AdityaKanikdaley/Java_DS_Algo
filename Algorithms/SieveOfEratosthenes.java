import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 10;
        s_o_e(n);
    }

    private static void s_o_e(int n) {

        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if (i) is Not a prime, else true.
        boolean[] primes = new boolean[n + 1];

        // fill all values to true
        Arrays.fill(primes, true);
        for (int p = 2; p * p <= n; p++) {

            // If prime[p] is not changed, then it is a prime
            if (primes[p] == true) {

                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    primes[i] = false;
            }
        }

        System.out.println("Primes till " + n);
        // Print all prime numbers
        for (int i = 2; i <= n; i++)
            if (primes[i] == true)
                System.out.print(i + " ");
    }
}