package apniKaksha.MISC;

// 0 1 1 2 3 5 8 13 24 ......

public class fibonacci {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int n = 8;
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i < n - 2; i++) { //i<n-2 because we already print a and b ie, 0 and 1
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
