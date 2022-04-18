package apniKaksha.Searching;

public class linear_search {

    static int search(int[] arr, int x) {
        int len = arr.length;
        for (int i = 0; i < len; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 5;
        int result = search(arr, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
