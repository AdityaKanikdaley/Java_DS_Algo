package apniKaksha.MISC;

// compute the natural logarithm of 2, by adding up to n terms in the series
// 1 - 1/2 + 1/3 - 1/4 + 1/5-.....1/n
// where n is positive int and input by user (can declare also).

// by tailor series
// 1 - 1/2 + 1/3 - 1/4 + 1/5-.....(infinity)  = log(base e) 2
public class series_sum2 {
    public static void main(String[] args) {
        int number = 8;
        float series_sum = 0;
        for (float i = 1; i <= number; i++) {
            if (i % 2 == 0) {  // in even denominator we -
                series_sum -= 1 / i;
            } else { // in odd denominator we +
                series_sum += 1 / i;
            }

        }
        System.out.println(series_sum);
    }
}
