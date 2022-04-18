package apniKaksha.Recursion;

// Q: calculate power using recursion a^b. + fast power
public class calculate_power {
    static int stepCount;

    public static void main(String[] args) {
        System.out.println(power(3, 10000) + " Steps: " + stepCount);  //3^4
        stepCount = 0;
        System.out.println(fastPow(3, 10000) + " Steps: " + stepCount);
    }

    static int power(int base, int pow) {
        stepCount++;
        if (pow == 0)
            return 1;
        return base * power(base, pow - 1);
    }

    /*
    fastPow(base, pow) = { 1, pow = 0}
                         { fastPow(a^2, pow/2) , pow is even}
                         { fastPow(a, pow-1), pow is odd}

             example - 1:
                   3^7 = 3.3^6
                   3^6 = (3^2)^3

             example - 2:
                    3^5 = 3.3^4
                    3^4 = (3^2)3^2

     */

    static int fastPow(int base, int pow) {
        System.out.println("Pow : " + pow);
        stepCount++;
        if (pow == 0)
            return 1;
        if (pow % 2 == 0)
            return fastPow(base * base, pow / 2);
        return base * fastPow(base, pow - 1);
    }
}
