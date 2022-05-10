// package ;

public class max_sum_hourGlass {
    
    static int findMaxSum(int N, int M, int Mat[][]) {
        
        if(N<3 || M<3) return -1;
        
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<N-1; i++) {
            
            for(int j=1; j<M-1; j++) {
                
                int sum = 0;
                
                sum += Mat[i][j];
                sum += Mat[i-1][j-1];
                sum += Mat[i-1][j];
                sum += Mat[i-1][j+1];
                sum += Mat[i+1][j];
                sum += Mat[i+1][j-1];
                sum += Mat[i+1][j+1];
                
                if(sum > max)
                    max = sum;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {  
        int N = 4, M = 5;
        int[][] Mat = {
                        {1, 3, 7, 9, 5},
                        {3, 10, 6,  10, 10},
                        {10, 1, 6, 4, 6},
                        {8, 2, 1, 1, 6}
                      };
        System.out.println(findMaxSum(N, M, Mat));
    }
}