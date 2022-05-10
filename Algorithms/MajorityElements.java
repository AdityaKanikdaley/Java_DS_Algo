// import java.util.*;
// uses algorithm: Boyer-Moore majority vote algorithm
// using this algorithm: time com = O(n) & space com = O(1)

public class MajorityElements {
    
    // method 1 Boyer-Moore Voting Algorithm - 1: tc= O(n), sc= O(1)
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 3, 1, 2};
        System.out.println(majorityElement(a));
    }
    
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    
    // method 2 sorting tc= O(nlgn), sc= O(1) or O(n)
    /*
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 3, 1, 2};
        System.out.println(majorityElement(a));
    }
    
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }  
    */
   
    // method 3 hashmap tc= O(n), sc= O(n)
    /*
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 3, 1, 2};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int key = nums[i];
            
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else
                map.put(key, 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > (nums.length/2))
                return entry.getKey();
        }
        
        //ignore this return
        return 0;
    }
    */

    // method 4 Boyer-Moore Voting Algorithm - 2: tc= O(n), sc= O(1)
    /*
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
    */
}
