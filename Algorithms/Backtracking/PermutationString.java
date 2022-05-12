package Backtracking;
import java.util.LinkedList;
import java.util.List;

public class PermutationString {

    static List<String> permutations = new LinkedList<>();

    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length());
        System.out.println("No. of permutations: " + permutations.size());
        System.out.println("Permutations: " + permutations);
    }

    private static void permute(String s, int l, int r) {

        // base condition
        if (l == r) {
            permutations.add(s);
            return;
        }

        for (int i = l; i < r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r);
            s = swap(s, l, i); // backtracking
        }
    }

    private static String swap(String s, int l, int i) {

        char[] arr = s.toCharArray();
        char temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return new String(arr);
    }
}
