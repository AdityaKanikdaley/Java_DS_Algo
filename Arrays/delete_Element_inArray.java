package apniKaksha.Arrays;

import java.util.Scanner;

public class delete_Element_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.print("Position to delete: ");
        int position = sc.nextInt();

        if (position == 0 || position > size || position < 0) // to handle exceptions
            System.out.println("element not fount at position " + position);
        else {
            for (int i = (position - 1); i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            for (int i = 0; i < size - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
