// MATRIX PATHS

// to count all the possible paths from top-left to bottom-right of a NxM matrix
// with rules that either move only right or down

// f(m, n) = it can be divided into 2 sub-problems = f(m-1, n) + f(m, n-1) in solving the cave

public class maneuveringCave {
    public static void main(String[] args) {
        System.out.println(numberOfPaths(3, 3));
    }

    private static int numberOfPaths(int m, int n) {

        // if only one row then have only 1 direction
        // if only 1 column then have only 1 direction
        // base condition
        if (m == 1 || n == 1)
            return 1;

        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }
}
