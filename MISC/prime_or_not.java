package apniKaksha.MISC;

public class prime_or_not {
    public static void main(String[] args) {

//        numbers < 2 are not prime
        int number = 31;

//        int count = 0;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//        if (count > 1) {
//            System.out.println("Not prime");
//        } else
//            System.out.println("Prime");

        // property of prime number
        // if number doesn't have a factor, in between 1 to root(number) then it is prime
        // ie, 1 < factor < root(number)

        boolean isPrime = true;
        for (int i = 2; i * i <= number; i++) { // i<root(number) = i*i<number
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (number < 2) {
            isPrime = false;
        }

        System.out.println("isPrime: " + isPrime);
    }
}
