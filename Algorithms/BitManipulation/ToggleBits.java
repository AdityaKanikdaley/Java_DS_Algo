package BitManipulation;

public class ToggleBits {
    public static void main(String[] args) {
        toggle(10);
    }

    private static void toggle(int n) {
        int temp = 1;
        while(temp <= n) {
            n = n^ temp;
            temp = temp << 1;
        }

        System.out.println(n);
    }
}