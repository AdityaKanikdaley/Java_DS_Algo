package apniKaksha.Algorithms.Strings;

// power set includes all possible pairs of chars in given string
// ex: abc = {"", a, b, c, ab, ac, bc, abc}

public class powerSet_String {
    public static void main(String[] args) {

        String s = "abc";
        powerSet(s, 0, "");
    }

    // using recursion: time complexity = O(2^n)
    private static void powerSet(String s, int i, String current) {

        // base condition
        if (i == s.length()) {
            System.out.print(current + " ");
            return;
        }

        powerSet(s, i + 1, current + s.charAt(i));
        powerSet(s, i + 1, current);
    }
}
