package apniKaksha.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// here we will see the time taken to add elements in linked list vs array list
public class LL_vs_AL {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        getTimeDiff(al);
        getTimeDiff(ll);
    }

    static void getTimeDiff(List<Integer> list) {
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
            /*
            inserting elements at 0th index,
            so all previous elements in array list will move 1 index forward but this is not the case in linked list.
            linked list will just point the 0th index with header that's it.
             */
        }
        long end_time = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " -> " + (end_time - start_time));
    }
}
