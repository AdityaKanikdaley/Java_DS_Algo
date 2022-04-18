package apniKaksha.MISC;

public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        int number = 3;

        // method 1
//        for (int i = number; i > 0; i--) {
//            fact *= i;
//        }

        // method 2
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

    }
}
