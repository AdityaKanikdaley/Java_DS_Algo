package apniKaksha.Recursion;

import java.util.HashSet;
import java.util.Set;

// Q: to print all permutations of a given string
public class permutation_ofString {

    static Set<String> set = new HashSet<>();

    // we use set as set can contain only unique values,
    // so that we won't get duplicate values
    public static void main(String[] args) {

        String string = "abc";
        permutations(string, 0, string.length() - 1);  // l = left pointer, r = right pointer
    }

    static void permutations(String s, int l, int r) {

        if (l == r) {
            if (set.contains(s)) return; // check if set already contains "s" then simply return
            set.add(s); // if not already present then add "s" to set
            System.out.print(s + " "); // print "s"
            return;
        }

        for (int i = l; i <= r; i++) {
            s = interchangeChar(s, l, i);
            permutations(s, l + 1, r);
            s = interchangeChar(s, l, i);
        }
    }

    static String interchangeChar(String s, int a, int b) {
        char[] array = s.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return String.valueOf(array);
    }
}
