public class PalindromeString {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println("Palindrome: " + isPalindrome(s, 0, s.length() - 1));
    }

    // using recursion - time complexity: O(n)
    private static boolean isPalindrome(String s, int l, int r) {

        // base condition
        if (l >= r)
            return true;

        if (s.charAt(l) != s.charAt(r))
            return false;

        return isPalindrome(s, l + 1, r - 1);
    }
}
