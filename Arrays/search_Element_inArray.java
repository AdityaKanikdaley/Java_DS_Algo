package apniKaksha.Arrays;

import java.util.Scanner;

public class search_Element_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.print("Element to search: ");
        int element = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++)
            if (array[i] == element) {
                count++;
                break;
            }

        if (count == 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found");
    }
}
