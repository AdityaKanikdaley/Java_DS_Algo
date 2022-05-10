import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// refer: https://github.com/awangdev/LintCode/blob/master/Java/Strobogrammatic%20Number%20II.java
public class Strobogrammatic {
    static List<String> singleDigitList = new ArrayList<>(Arrays.asList("0", "1", "8"));
    static char[][] digitPair = {{'0', '0'}, {'1', '1'}, {'8', '8'}, {'6', '9'}, {'9', '6'}};

    public static List<String> findStrobogrammatic(int n) {
        return dfs(n, n);
    }

    public static List<String> dfs(int n, int max) {
        if (n <= 0) return new ArrayList<>(List.of(""));
        if (n == 1) return singleDigitList;

        List<String> subList = dfs(n - 2, max);
        List<String> list = new ArrayList<>();
        for (String str : subList) {
            if (n != max) list.add("0" + str + "0");
            for (int i = 1; i < digitPair.length; i++) {
                list.add(digitPair[i][0] + str + digitPair[i][1]);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int n = 2;
        List<String> list = findStrobogrammatic(n);
        System.out.println(list.toString());
    }
}