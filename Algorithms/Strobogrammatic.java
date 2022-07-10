// to see if the number is Strobogrammatic or not
// if a number contain numbers other than 0, 1, 8, 6, 9 then its non Strobogrammatic
// but if number contains: 6 or 9 : convert 6->9 & 9->6
// test cases: 8698, 9696, 1691, 6795, 1221

public class Strobogrammatic {

    public static void main(String[] args) {
        int num = 9898;
        System.out.println(solve(num));
    }

    private static boolean solve(int num) {

        int temp = num;
        int revNum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;

            if (lastDigit == 0 || lastDigit == 1 || lastDigit == 8 || lastDigit == 6 || lastDigit == 9) {
                if (lastDigit == 6) lastDigit = 9;
                else if (lastDigit == 9) lastDigit = 6;
            } else {
                return false;
            }

            revNum = (revNum * 10) + lastDigit;
            temp /= 10;
        }

        System.out.println("Num: " + num);
        System.out.println("Rev: " + revNum);
        return revNum == num;
    }
}

/*

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
 */