package DynamicProgramming;

// Kadane's algorithm : find the largest sum in contiguous subArray

class KadaneAlgorithm {

    // this approach handles when all elements in array are negative
    static int maxSubArraySum(int[] a, int size)
    {
        int max_so_far = a[0];
        int current_max = a[0];

        for (int i = 1; i < size; i++)
        {
            current_max = Math.max(a[i], current_max + a[i]);
            max_so_far = Math.max(max_so_far, current_max);
        }
        return max_so_far;
    }

    /*

    // this approach can't handle if all elements are negative

     static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, current_max = 0;

        for (int i = 0; i < size; i++)
        {
            current_max = current_max + a[i];
            if (current_max > max_so_far)
                max_so_far = current_max;
            if (current_max < 0)
                current_max = 0;
        }
        return max_so_far;
    }
     */

    /* Driver program to test maxSubArraySum */
    public static void main(String[] args)
    {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = maxSubArraySum(a, a.length);
        System.out.println("Maximum contiguous sum is " + max_sum);
    }
}
