/*
formula: (a+b) % n = (a%n + b%n) % n
         (a*b) % n = (a%n * b%n) % n
*/
public class moduloArithmetics {
    public static void main(String[] args) {
        System.out.println(fastPower(3978432, 5, 1000000007));
    }

    private static long fastPower(long a, long b, int n) {

        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0)  // check if b is odd
                result = (result * a % n) % n; // (result % n * a % n) % n = (result * a % n) % n as result < n, so its modulo will be result itself

            a = (a % n * a % n) % n;
            b = b >> 1; // divide by 2
        }
        return result;
    }
}
