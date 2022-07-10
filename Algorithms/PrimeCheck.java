public class PrimeCheck {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = check(n);
        if (ans)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    private static boolean check(int n) {

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}