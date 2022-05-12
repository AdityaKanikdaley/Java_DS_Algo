package DynamicProgramming;
// import java.util.Arrays;

public class CoinChange {

    // Top Down approach: 1D array: tc= O(coins*amount), sc= O(n)
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; 
        int amount = 6;

        int MAX = 100000;
        int[] dp = new int[amount+1];

        // start filling from 1-index the max value
        for(int i=1;i<dp.length;i++) 
	        dp[i] = MAX;
        
        // compute the rest
        for(int i=0;i<coins.length;i++)
	        for(int j=coins[i];j<=amount;j++)
		        dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);

        int answer = (dp[amount] == MAX ? -1 : dp[amount]);

        // Final answer
        System.out.println("Answer: " + answer); 

        // Visualization of dp-array
        for(int k=0;k<=amount;k++) System.out.print(dp[k]+" ");        
    }
}




/*
public class CoinChange {

    // refer: https://www.youtube.com/watch?v=ZI17bgz07EE
    // Bottom Up approach: 2D array: tc= O(coins*amount), sc= O(n)
    public static void main(String[] args) {
        
        int[] coins = {1, 2, 5}; 
        int n = coins.length;
        int amount = 6;

        int[][] mat = new int[coins.length+1][amount+1];

        // main logic
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=amount; j++) {
                
                if(j==0)
                    mat[i][j] = 0;
                else if(i==0)
                    mat[i][j] = (int)1e5;
                else if(coins[i-1] > j)
                    mat[i][j] = mat[i-1][j];
                else
                    mat[i][j] = Math.min(1+ mat[i][j-coins[i-1]], mat[i-1][j]);
            
            }
        }

        int answer = mat[n][amount] >= (int)1e5 ? -1 : mat[n][amount];
        
        // Final answer
        System.out.println("Answer: " + answer); 

        // Visualization of the table
        for(int[] cur : mat)
            System.out.println(Arrays.toString(cur));
    }
}
*/