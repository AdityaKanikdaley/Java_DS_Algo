package apniKaksha.Arrays;

import java.util.Scanner;

public class insert_Element_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        int[] array = new int[size + 1];

        System.out.println("Enter array:");
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.print("Position: ");
        int position = sc.nextInt();
        System.out.print("Element to insert: ");
        int element = sc.nextInt();


        if (position > array.length || position < 0)
            System.out.println("Not possible to insert at " + position + "th position");
        else if (position == 0) { // to handle exceptions
            for (int i = (size - 1); i >= (position); i--) {
                array[i + 1] = array[i];
            }
            array[position] = element;

            for (int i = 0; i < size + 1; i++)
                System.out.print(array[i] + " ");
        } else {
            for (int i = (size - 1); i >= (position - 1); i--) {
                array[i + 1] = array[i];
            }
            array[position - 1] = element;

            for (int i = 0; i < size + 1; i++)
                System.out.print(array[i] + " ");
        }

    }
}
