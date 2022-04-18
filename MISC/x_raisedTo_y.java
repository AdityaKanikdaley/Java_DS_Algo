package apniKaksha.MISC;

public class x_raisedTo_y {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // 2^3
        int power = 1;
        for (int i = 0; i < b; i++) {
            power *= a;
        }
        System.out.println(power);
    }
}
