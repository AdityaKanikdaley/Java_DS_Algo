package apniKaksha.MISC;

//write a program to cal sum of the series where n is input (you can even declare n)
// 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...... + 1/n

public class series_sum1 {
    public static void main(String[] args) {

        int number = 5;
        float series_sum = 0;
        for (float i = 1; i <= number; i++) {
            series_sum += 1 / i;
        }
        System.out.println(series_sum);
    }
}
