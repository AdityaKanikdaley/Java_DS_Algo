// power set includes all possible pairs of chars in given string
// ex: abc = {"", a, b, c, ab, ac, bc, abc}

import java.util.ArrayList;
import java.util.List;

public class PowerSetString {
    public static void main(String[] args) {

        String s = "abc";
        List<String> result = new ArrayList<>();
        powerSet(s, 0, "", result);
        System.out.println(result);
    }

    // using recursion: time complexity = O(2^n)
    private static void powerSet(String s, int i, String current, List<String> result) {

        // base condition
        if (i == s.length()) {
            result.add(current);
            return;
        }

        powerSet(s, i + 1, current + s.charAt(i), result);
        powerSet(s, i + 1, current, result);
    }
}
