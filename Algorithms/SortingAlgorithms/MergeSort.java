package SortingAlgorithms;

import java.util.Arrays;

/*
refer: https://www.youtube.com/watch?v=aDX3MFL0tYs

tc: O(Nlog(N)) in best case
    O(Nlog(N)) in average case
    O(Nlog(N)) in worst case

sc: O(N) for recursive call stack
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) { // continue only if left < right -> array have at least 2 elements
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid); // call mergeSort for left half
            mergeSort(arr, mid + 1, r); // call mergeSort for right half
            merge(arr, l, mid, r); // after recursion, merge left and right halves
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] b = new int[arr.length]; // new temp array

        int i = l;
        int j = mid + 1;
        int k = l;

        while (i <= mid && j <= r) { // i will go till mid only & j will go only till right
            if (arr[i] < arr[j]) { // if arr[i] < arr[j] -> take that ith element and i++
                b[k] = arr[i];
                i++;
            } else { // otherwise take jth element and j++
                b[k] = arr[j];
                j++;
            }
            k++; // k++ to go next index in "b[]"
        }

        if (i > mid) { // if left half exhausted and right half is still have some elements -> copy those right half elements as it is in "b[]"
            while (j <= r) {
                b[k] = arr[j];
                k++;
                j++;
            }
        } else { // if right half exhausted and left half still have some elements -> copy those left elements as it is in "b[]"
            while (i <= mid) {
                b[k] = arr[i];
                k++;
                i++;
            }
        }

        for (k = l; k <= r; k++) { // copy all elements from temp array "b[]" to "arr[]"
            arr[k] = b[k];
        }
    }
}