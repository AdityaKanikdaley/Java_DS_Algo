public class PermutationString {
    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length());
    }

    private static void permute(String s, int l, int r) {

        // base condition
        if (l == r) {
            System.out.print(s + " ");
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
