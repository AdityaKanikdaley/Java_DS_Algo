package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MultiplePermutationsString {

    public static void main(String[] args) {

        String[] str_arr = {"2", "71", "234"};
        List<List<String>> all_permutations = new ArrayList<>();

        for (String s : str_arr) {
            List<String> curList = cal_permute(s);
            all_permutations.add(curList);
        }

        for(List<String> s : all_permutations)
            System.out.println(s);
    }

    private static List<String> cal_permute(String str) {

        List<String> permutation = new ArrayList<>();
        solve(permutation, str, 0, str.length());

        return permutation;
    }

    private static void solve(List<String> permutation, String str, int l, int r) {

        if(l == r) {
            permutation.add(str);
            return;
        }

        for(int i=l; i<r; i++) {
            str = swap(str, l, i);
            solve(permutation, str, l+1, r);
            str = swap(str, l, i);
        }
    }

    private static String swap(String str, int a, int b) {

        char[] ch = str.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;

        return new String(ch);
    }
}
