package SortingAlgorithms;

/*
refer:  https://www.youtube.com/watch?v=wWhAhp6PIuQ

In insertion sort, we do fewer operations than bubble sort,
that's why we also call insertion sort is an optimization over bubble sort.

tc: O(n) in best case
    O(n^2) in average case
    O(n^2) in worst case

sc: O(1)
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 3, 2, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; // right shifting of elements
                j--;
            }

            arr[j + 1] = temp; // assigning temp to the space caused due to right shift
        }
    }
}