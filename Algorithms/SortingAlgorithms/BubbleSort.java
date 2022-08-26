package SortingAlgorithms;

import java.util.Arrays;

/*
refer: https://www.youtube.com/watch?v=bBQkErahU9c

tc: O(n) in best case
    O(n^2) in average case
    O(n^2) in worst case

sc: O(1)
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j + 1] < arr[j])
                    swap(arr, j + 1, j);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}