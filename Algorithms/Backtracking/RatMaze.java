package Backtracking;
import java.util.ArrayList;
import java.util.Arrays;

// refer: https://www.youtube.com/watch?v=bLGZhJlt4y0&list=PLgUwDviBIf0rQ6cnlaHRMuOp4H_D-7hwP&index=12

// method - 1: good approach but lengthy to write. But works with all test cases
public class RatMaze {
    
    public static void main(String[] args) {
        
        int matrix[][] = {  { 1, 0, 0, 0, 0 },
                            { 1, 1, 1, 1, 1 },
                            { 1, 1, 1, 0, 1 },
                            { 0, 0, 0, 0, 1 },
                            { 0, 0, 0, 0, 1 } 
                         };

        int n = matrix.length;

        ArrayList<String> answer = Path(matrix, n);
        System.out.println(answer);
    }

    private static ArrayList<String> Path(int[][] matrix, int n) {
        
        int[][] visited = new int[n][n];
              
        ArrayList<String> answer = new ArrayList<>();
        if(matrix[0][0] == 1)
            solve(0, 0, matrix, n, answer, "", visited);
        
        return answer;
    }

    private static void solve(int i, int j, int[][] matrix, int n, ArrayList<String> answer, String move,
            int[][] visited) {
           
        //base condition
        if(i==n-1 && j==n-1) {
            visited[i][j] = 1;
            answer.add(move);
            print(visited);
            visited[i][j] = 0;
            return;
        }
        
       //downward
       if(i+1 < n && visited[i+1][j] == 0 && matrix[i+1][j] == 1) {
           visited[i][j] = 1;
           solve(i+1, j, matrix, n, answer, move + 'D', visited);
           visited[i][j] = 0;
       }

       //left
       if(j-1 >= 0 && visited[i][j-1] == 0 && matrix[i][j-1] == 1) {
           visited[i][j] = 1;
           solve(i, j-1, matrix, n, answer, move + 'L', visited);
           visited[i][j] = 0;
       }

       //right
       if(j+1 < n && visited[i][j+1] == 0 && matrix[i][j+1] == 1) {
           visited[i][j] = 1;
           solve(i, j+1, matrix, n, answer, move + 'R', visited);
           visited[i][j] = 0;
       }

       //upward
       if(i-1 >=0 && visited[i-1][j] == 0 && matrix[i-1][j] == 1) {
           visited[i][j] = 1;
           solve(i-1, j, matrix, n, answer, move + 'U', visited);
           visited[i][j] = 0;
       }
    }

    private static void print(int[][] visited) {
        for(int[] cur : visited) {
            System.out.println(Arrays.toString(cur));
        }
        System.out.println();
    }
}

// method - 2: good approach but dosen't work for all cases on GFG
/*
import java.util.ArrayList;
import java.util.Arrays;

public class RatMaze {
    
    public static void main(String[] args) {
        
        int matrix[][] = {  { 1, 0, 0, 0, 0 },
                            { 1, 1, 1, 1, 1 },
                            { 1, 1, 1, 0, 1 },
                            { 0, 0, 0, 0, 1 },
                            { 0, 0, 0, 0, 1 } };

        int n = matrix.length;

        ArrayList<String> answer = Path(matrix, n);
        System.out.println(answer);
    }

    private static ArrayList<String> Path(int[][] matrix, int n) {
        
        int[][] visited = new int[n][n];
        int[] di = {+1, 0, 0, -1};
        int[] dj = {0, -1, +1, 0};
        
        ArrayList<String> answer = new ArrayList<>();
        if(matrix[0][0] == 1)
            solve(0, 0, matrix, n, answer, "", visited, di, dj);
        
        return answer;
    }

    private static void solve(int i, int j, int[][] matrix, int n, ArrayList<String> answer, String move,
            int[][] visited, int[] di, int[] dj) {
           
                //base condition
        if(i==n-1 && j==n-1) {
            answer.add(move);
            print(visited);
            return;
        }
        
        String directions = "DLRU";
        for(int index = 0; index<n; index++) {
            int nexti = i + di[index];
            int nextj = j + dj[index];
            
            // checking boundary conditions and other conditions at once
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && visited[nexti][nextj] == 0 && matrix[nexti][nextj] == 1) {
                visited[nexti][nextj] = 1;
                solve(nexti, nextj, matrix, n, answer, move + directions.charAt(index), visited, di, dj);
                visited[nexti][nextj] = 0;
            }
        }
    }

    private static void print(int[][] visited) {
        for(int[] cur : visited) {
            System.out.println(Arrays.toString(cur));
        }
        System.out.println();
    }
}
*/