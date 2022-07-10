import java.util.ArrayList;
import java.util.List;

public class PowerSetArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        getSubsets(arr, result, new ArrayList<>(), 0);
        for (List<Integer> l : result)
            System.out.println(l);
    }

    private static void getSubsets(int[] arr, List<List<Integer>> result, List<Integer> curList, int start) {
        result.add(new ArrayList<>(curList));
        for (int i = start; i < arr.length; i++) {
            curList.add(arr[i]);
            getSubsets(arr, result, curList, i + 1);
            curList.remove(curList.size() - 1);
        }
    }
}
