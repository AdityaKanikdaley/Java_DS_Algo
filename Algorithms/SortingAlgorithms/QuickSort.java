package SortingAlgorithms;

import java.util.Arrays;

/*
refer: https://www.youtube.com/watch?v=CnS2Qt8erEI
refer: https://www.youtube.com/watch?v=UA_Rmjfj4bw

tc: O(Nlog(N)) in best case
    O(Nlog(N)) in average case
    O(N^2) in worst case

sc: O(N) for recursive call stack

Example with explanation:
    {4, 8, 1, 3, 2, 7}  assumption = pivot = always first element
    so, pivot = 4
        i = low index = 0
        j = high index = len-1

        i will move right and check for the number greater than pivot (i++ if arr[i] <= pivot)
        j will move left and check for the number lower than pivot (j-- if arr[j] > j)

        Explanation for:
            while(i <= high && arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
        If the pivot element is the largest element at any point in the recursion,
        i will keep on incrementing and will ultimately result in an ArrayIndexOutOfBoundsException.
        Hence, we need to have a check before the equality condition as due to the lazy operation
        of Logical AND, if the first condition fails, 2nd won't be checked.

        The same thing is not required in the 2nd while loop as j will never go less than i.

        Explanation for:
            if(i < j)
                swap(arr, i, j);
        swap only if "i" < "j",
        think of example of sorting [9,8] :
                            here "i" will become: 0->1->2
                            here "j" will become: 1
                            so swapping arr[i], arr[j] is not possible as it will go out of bounds

        Explanation for:
            swap(arr, j, low);
        At the end we swap pivot with "j"
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 3, 2, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < j)
                swap(arr, i, j);
        }

        swap(arr, j, low); // swap pivot with "j"

        return j;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}