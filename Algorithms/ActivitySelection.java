import java.util.*;

// this approach does not work with -ve values
class Activity {
    int start, finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

class solution {
    static void printMaxActivities(Activity arr[], int n) {

        Arrays.sort(arr, new Comparator<Activity>() {
            @Override
            public int compare(Activity s1, Activity s2) {
                return s1.finish - s2.finish;
            }
        });
        
        System.out.println("Following activities are selected : ");

        int i = 0;
        System.out.print("(" +
                arr[i].start + ", " +
                arr[i].finish +
                "), ");

        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].finish) {
                System.out.print("(" + arr[j].start + ", "
                        + arr[j].finish + "), ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {

        int n = 6;
        Activity arr[] = new Activity[n];
        arr[0] = new Activity(5, 9);
        arr[1] = new Activity(1, 2);
        arr[2] = new Activity(3, 4);
        arr[3] = new Activity(0, 6);
        arr[4] = new Activity(5, 7);
        arr[5] = new Activity(8, 9);

        printMaxActivities(arr, n);
    }
}
