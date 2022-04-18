package apniKaksha.Recursion;

// Q: find all the paths in NxM grid
public class paths_in_NxM_grid {
    public static void main(String[] args) {
        System.out.println(paths(4, 4));
    }

    static int paths(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return paths(n, m - 1) + paths(m, n - 1);
    }
}
