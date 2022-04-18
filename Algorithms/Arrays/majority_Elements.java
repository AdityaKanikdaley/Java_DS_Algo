package apniKaksha.Algorithms.Arrays;

// uses algorithm: Boyer-Moore majority vote algorithm
// using this algorithm: time com = O(n) & space com = O(1)

public class majority_Elements {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 3, 1, 2};
        printMajority(a, a.length);
    }

    private static void printMajority(int[] a, int size) {

        // find the candidates for majority
        int candidate = findCandidate(a, size);

        // print the candidate if it is Majority
        if (isMajority(a, size, candidate))
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("No Majority Element");
    }

    private static int findCandidate(int[] a, int size) {

        int majority_index = 0;
        int count = 1;

        for (int i = 1; i < size; i++) {
            if (a[majority_index] == a[i])
                count++;
            else
                count--;

            if (count == 0) {
                majority_index = i;
                count = 1;
            }
        }

        return a[majority_index];
    }

    private static boolean isMajority(int[] a, int size, int candidate) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (a[i] == candidate)
                count++;

        return count > size / 2;

    }
}
