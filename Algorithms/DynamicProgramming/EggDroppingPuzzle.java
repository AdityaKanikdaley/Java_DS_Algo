package DynamicProgramming;
import java.util.Arrays;

public class EggDroppingPuzzle {
    
    // refer: https://www.youtube.com/watch?v=UvksR0hR9nA
    // tc= O(k*n*n), sc= O(n)
    // bottom up approach, using 2D array
    // refer leetcode for mathematical and optimality creation approaches

    public static int superEggDrop(int k, int n) {
        
        // k = eggs, n = floors
        
        int[][] dp = new int[k+1][n+1];
        
        for(int i = 1; i <= k; i++) {
            for(int j = 1; j <= n; j++) {
                
                if(i == 1)
                    dp[i][j] = j;
                else if(j == 1)
                    dp[i][j] = 1;
                else {
                    int min = Integer.MAX_VALUE;
                    
                    for(int mj = j-1, pj = 0; mj >= 0; mj--, pj++) {
                        int v1 = dp[i][mj]; // egg survives
                        int v2 = dp[i-1][pj]; // egg breaks
                        int val = Math.max(v1, v2);
                        min = Math.min(val, min);
                    }
                    
                    dp[i][j] = min + 1;
                }
            }
        }
        
        // print dp for regerence
        for(int[] cur : dp)
            System.out.println(Arrays.toString(cur));
        
        return dp[k][n];
    }

    public static void main(String[] args) {
        System.out.println("Answer: " + superEggDrop(3, 7));
    }
}
