package apniKaksha.Arrays;

import java.util.Scanner;

public class min_max_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}

