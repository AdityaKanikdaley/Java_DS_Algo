package apniKaksha.MISC;

// multiplication table 20x20
public class whole_multiplication_table {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
    }
}
