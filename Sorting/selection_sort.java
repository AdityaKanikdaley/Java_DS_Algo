package apniKaksha.Sorting;

// reference https://www.youtube.com/watch?v=xWBP4lzkoyM

public class selection_sort {
    public static void main(String[] args) {

        int[] a = {2, 4, 5, -1, 4, 5};

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //swapping (minIndex) to (i)
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for (int e : a
        ) {
            System.out.print(e + " ");
        }
    }
}
