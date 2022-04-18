package apniKaksha.MISC;

public class greatestOf3 {
    public static void main(String[] args) {
        int a = 212, b = 180, c = 100;
        int result = 0;


//        if (a > b) {
//            if (a > c) {
//                result = a;
//            } else {
//                result = c;
//            }
//        } else {
//            if (b > c) {
//                result = b;
//            } else {
//                result = c;
//            }
//        }

        // alternative
        result = a > b ? a > c ? a : c : b > c ? b : c;

        System.out.println("greatest of the 3 is: " + result);
    }
}
