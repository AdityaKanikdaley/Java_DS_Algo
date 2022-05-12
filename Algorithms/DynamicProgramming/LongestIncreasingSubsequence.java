package DynamicProgramming;

import java.util.Arrays;

// method - 1
// tc= O(n^2), sc= O(n)

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        
        int[] nums = {10,9,2,5,3,7,101,18};

        int n = nums.length;
        
        // creating dp array
        int t[] = new int[n];
        Arrays.fill(t, 1);  // every number in itself is a LIS of length 1
        
        // O(n_square) solution
        // t[i] -> is the length of LIS till i
        for(int i = 1; i < n; i++) {
            // simply iterating over array till 'i', and updating 't' array
            for(int j = 0; j < i ; j++) {
                if(nums[j] < nums[i]) {
                    t[i] = Math.max(t[i], t[j] + 1);
                }
            }
        }
        
        // finding maximum in the dp array 't'
        int LIS_length = 0;
        for(int v : t) {
           if(v > LIS_length) {
               LIS_length = v;
           }
        }

        System.out.println(LIS_length);
    }
}




// method - 2
// refer: https://www.youtube.com/watch?v=odrfUCS9sQk
// tc= O(n^2), sc= O(n)
/*    
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        
        int[] nums = {10,9,2,5,3,7,101,18};

        int overallMax = 0;
        int dp[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int max = 0;
            
            for(int j=0; j<i; j++) {
                if(nums[i] > nums[j])
                    if(dp[j] > max)
                        max = dp[j];
            }
            
            dp[i] = max + 1;
            
            if(dp[i] > overallMax)
                overallMax = dp[i];
        }

        System.out.println(overallMax);
    }
}
*/
