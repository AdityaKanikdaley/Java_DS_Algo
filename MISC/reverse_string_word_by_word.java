package apniKaksha.MISC;

import java.util.Scanner;

// refer https://www.youtube.com/watch?v=tNNJWsVo748&list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s&index=27
public class reverse_string_word_by_word {

    static String reverseWords(String s) {
        int i = s.length() - 1;
        String ans = "";
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            int j = i;
            if (i < 0) break;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = sc.nextLine();
        System.out.println(reverseWords(string));

    }
}
