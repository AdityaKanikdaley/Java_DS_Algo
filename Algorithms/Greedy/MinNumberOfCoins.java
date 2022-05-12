package Greedy;
import java.util.LinkedList;
import java.util.List;


// greedy method.
// dosen't work for all denominations.
// For example, it doesn’t work for denominations {9, 6, 5, 1} and V = 11. The above approach would print 9, 1 and 1. But we can use 2 denominations 5 and 6.
// For example, if doesn't word for denominations {4, 10, 25} and V = 41. Greedy approach will give (-1 as no solution exist) but we can take {25, 4, 4, 4, 4} as answer.

public class MinNumberOfCoins {
    // refer: https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/
    static int[] denominations = {1, 2, 5, 10, 20, 50, 500, 1000};
    static int n = denominations.length;
    static List<Integer> ans = new LinkedList<>();

    static void findMinCoin(int V) {

        for(int i=n-1; i>=0; i--) {

            while(V >= denominations[i]) {
                V -= denominations[i];
                ans.add(denominations[i]);
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {     
        findMinCoin(93);
        System.out.println("MinCoin: " + ans);
    }
}