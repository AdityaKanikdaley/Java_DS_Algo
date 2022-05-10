// EUCLID GCD

/*
formula of GCD = GCD(a, b) = GCD(a-b, b) , a>b
           GCD(a, b) = GCD(b, a%b), till a%b != 0
*/

public class EuclidGCD {
    public static void main(String[] args) {
        System.out.println(e_gcd(24, 60));
    }

    private static int e_gcd(int a, int b) {

        // base condition
        if (b == 0) return a;

        //  here:   a   b
        return e_gcd(b, a % b);
    }
}
