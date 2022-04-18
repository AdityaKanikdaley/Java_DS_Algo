package apniKaksha.Sorting;

// reference https://www.youtube.com/watch?v=nmhjrI-aW5o
public class bubble_sort {
    public static void main(String[] args) {

        int[] a = {2, 4, 5, -1, 4, 5};

        for (int i = 0; i < a.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < a.length - 1 - i; j++) { // normally = a.length - 1 & optimized = a.length - 1 - i
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;

                    sorted = false;
                }
            }
            if (sorted) break;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
