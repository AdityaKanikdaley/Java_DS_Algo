package apniKaksha.Searching;

public class binary_search {

    static int search(int[] arr, int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // if already present in middle
            if (arr[mid] == x)
                return mid;

            // if element is smaller than mid
            if (x < arr[mid])
                return search(arr, l, mid - 1, x);

            // if element is bigger than mid
            return search(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        int result = search(arr, 0, arr.length, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
