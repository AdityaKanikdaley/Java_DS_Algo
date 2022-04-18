package apniKaksha.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[] a = {3, 10, 5, 1, 15, 10, 7, 6};
        int[] answer = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for(int i = a.length-1; i>=0; i--){

            while (!s.isEmpty() && s.peek()>=a[i])
                s.pop();

            if(s.isEmpty())
                answer[i] = -1;
            else
                answer[i] = s.peek();

            s.push(a[i]);
        }
        System.out.println(Arrays.toString(answer));
    }
}
