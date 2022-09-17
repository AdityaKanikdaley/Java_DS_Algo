package DynamicProgramming;

import java.util.Arrays;

// refer: https://takeuforward.org/data-structure/0-1-knapsack-dp-19/

class Recursion_Knapsack01 {
    public static void main(String[] args) {
        int n = 3;
        int[] weights = {3, 2, 5};
        int[] values = {40, 30, 50};
        int W = 6;
        System.out.println(solve(n-1,  W, weights, values));
    }

    private static int solve(int index, int W, int[] wt, int[] val) {

        // base
        if(index == 0) {
            if(wt[0] <= W) return val[0]; // can take of 0th index
            else return 0; // can't take 0th index as maxWeight limit exceeded
        }

        int notTake = 0 + solve(index-1, W, wt, val);
        int take = Integer.MIN_VALUE; // as can only take if wt[index] <= W
        if(wt[index] <= W)
            take = val[index] + solve(index-1, W-wt[index], wt, val);

        return Math.max(notTake, take);
    }
}

class Memoization_Knapsack01 {
    public static void main(String[] args) {
        int n = 3;
        int[] weights = {3, 2, 5};
        int[] values = {40, 30, 50};
        int W = 6;
        int[][] dp = new int[n+1][W+1];

        for(int[] a : dp)
            Arrays.fill(a, -1);

        System.out.println(solve(n-1,  W, weights, values, dp));
    }

    private static int solve(int index, int W, int[] wt, int[] val, int[][] dp) {

        // base
        if(index == 0) {
            if(wt[0] <= W) return val[0]; // can take of 0th index
            else return 0; // can't take 0th index as maxWeight limit exceeded
        }
        if(dp[index][W] != -1) return dp[index][W];

        int notTake = 0 + solve(index-1, W, wt, val, dp);
        int take = Integer.MIN_VALUE; // as can only take if wt[index] <= W
        if(wt[index] <= W)
            take = val[index] + solve(index-1, W-wt[index], wt, val, dp);

        return dp[index][W] = Math.max(notTake, take);
    }
}

class Tabulation_Knapsack01 {
    public static void main(String[] args) {
        int n = 3;
        int[] weights = {3, 2, 5};
        int[] values = {40, 30, 50};
        int maxWeight = 6;
        int[][] dp = new int[n+1][maxWeight+1];

        System.out.println(solve(n, maxWeight, weights, values, dp));
    }

    private static int solve(int n, int maxWeight, int[] wt, int[] val, int[][] dp) {

        // base
        for(int W = wt[0]; W<=maxWeight; W++) dp[0][W] = val[0];

        for(int index = 1; index<n; index++) {
            for(int W = 0; W<= maxWeight; W++) {
                int notTake = 0 + dp[index-1][W];
                int take = Integer.MIN_VALUE; // as can only take if wt[index] <= W
                if(wt[index] <= W)
                    take = val[index] + dp[index-1][W-wt[index]];

                dp[index][W] = Math.max(notTake, take);
            }
        }

        return dp[n-1][maxWeight];
    }
}

class Tabulation_Knapsack01_SpaceOptimized {
    public static void main(String[] args) {
        int n = 3;
        int[] weights = {3, 2, 5};
        int[] values = {40, 30, 50};
        int maxWeight = 6;

        System.out.println(solve(n, maxWeight, weights, values));
    }

    private static int solve(int n, int maxWeight, int[] wt, int[] val) {

        // base
        int[] prev = new int[maxWeight+1];
        int[] cur = new int[maxWeight+1];

        for(int W = wt[0]; W<=maxWeight; W++) prev[W] = val[0];

        for(int index = 1; index<n; index++) {
            for(int W = 0; W<= maxWeight; W++) { // for(int W = maxWeight; W>=0; W--) this also works
                int notTake = 0 + prev[W];
                int take = Integer.MIN_VALUE; // as can only take if wt[index] <= W
                if(wt[index] <= W)
                    take = val[index] + prev[W-wt[index]];

                cur[W] = Math.max(notTake, take);
            }

            prev = cur;
        }

        return prev[maxWeight];
    }
}

class Tabulation_Knapsack01_More_SpaceOptimized {
    public static void main(String[] args) {
        int n = 3;
        int[] weights = {3, 2, 5};
        int[] values = {40, 30, 50};
        int maxWeight = 6;

        System.out.println(solve(n, maxWeight, weights, values));
    }

    private static int solve(int n, int maxWeight, int[] wt, int[] val) {

        // base
        int[] prev = new int[maxWeight+1];

        for(int W = wt[0]; W<=maxWeight; W++) prev[W] = val[0];

        for(int index = 1; index<n; index++) {
            for(int W = maxWeight; W>=0; W--) { // for(int W = maxWeight; W>=0; W--) this also works
                int notTake = 0 + prev[W];
                int take = Integer.MIN_VALUE; // as can only take if wt[index] <= W
                if(wt[index] <= W)
                    take = val[index] + prev[W-wt[index]];

                prev[W] = Math.max(notTake, take);
            }
        }

        return prev[maxWeight];
    }
}

// refer: https://medium.com/@fabianterh/how-to-solve-the-knapsack-problem-with-dynamic-programming-eb88c706d3cf
// refer: https://youtu.be/y6kpGJBI7t0

class Knapsack_Anuj {
    public static void main(String[] args) {
        int w = 10;
        int n = 4;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};

        // Populate base cases
        int[][] mat = new int[n + 1][w + 1];
        for (int r = 0; r < w + 1; r++) {
            mat[0][r] = 0;
        }
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }
        
        // Main logic
        for (int item = 1; item <= n; item++) {
            for (int capacity = 1; capacity <= w; capacity++) {
                int maxValWithoutCurr = mat[item - 1][capacity]; // This is guaranteed to exist
                int maxValWithCurr = 0; // We initialize this value to 0
                
                int weightOfCurr = wt[item - 1]; // We use item -1 to account for the extra row at the top
                if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
                    maxValWithCurr = val[item - 1]; // If so, maxValWithCurr is at least the value of the current item
                    
                    int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
                    maxValWithCurr += mat[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
                }
                
                mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
            }
        }
        
        // Final answer
        System.out.println("Answer: " + mat[n][w]); 

        // Visualization of the table
        for(int[] cur : mat)
            System.out.println(Arrays.toString(cur));      
    }
}