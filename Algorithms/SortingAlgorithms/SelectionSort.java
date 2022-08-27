package SortingAlgorithms;

import java.util.Arrays;

/*
refer:  https://www.youtube.com/watch?v=B-nqY6IYqVw

tc: O(n^2) in best case
    O(n^2) in average case
    O(n^2) in worst case

sc: O(1)
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 3, 2, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        // "min", "i", "j" -> these are indices not values
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) // to prevent swapping from itself (extra swap)
                swap(arr, min, i);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}