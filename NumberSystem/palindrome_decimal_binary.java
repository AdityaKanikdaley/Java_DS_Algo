package apniKaksha.NumberSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class palindrome_decimal_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // method - 1
//        int quotient;
//        int remainder;
//        String result = "";
//        while (number >= 1){
//            quotient = number/2;
//            remainder = number%2;
//            result = result.concat(String.valueOf(remainder));
//            number = quotient;
//        }
//
//        System.out.println("Before: " + result);
//
//        // print reverse as in binary conversion we take from down to up.
//        int rev_length = result.length();
//        String reverse_str = "";
//
//        for(int i = rev_length - 1; i >= 0; i--)
//
//            // reverse_str = reverse_str + result.charAt(i); // can use this also
//            reverse_str = reverse_str.concat(String.valueOf(result.charAt(i)));
//
//        System.out.println("Binary: " + reverse_str);
//
//        // palindrome checking
//
//        if(reverse_str.equals(result))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");


        // not needed --> as Integer.parse eliminates the first 0 --> 011 = 11
//        int num = Integer.parseInt(reverse_str);
//        int temp_num = num;
//        int p_rev = 0;
//
//        while (num != 0){
//            int last_digit = num % 10;
//            p_rev = p_rev * 10 + last_digit;
//            num = num / 10;
//        }
//
//        System.out.println("Reverse num: " + p_rev);
//
//        if(temp_num == p_rev)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not palindrome");


        // method  - 2 --> using ArrayList --> using arrayList & more simple logic to convert Dec to Bin
        ArrayList<Integer> toBinary = new ArrayList<>();
        while (number > 0) { // convert to binary
            toBinary.add(number % 2);
            number /= 2;
        }
        Collections.reverse(toBinary); // reversing because we take down to up in Dec to Bin conversion

        ArrayList<Integer> tempBinary = new ArrayList<>(toBinary); // making temp arrayList for reversing

        Collections.reverse(tempBinary); // to give the reverse of binary to reverse arrayList
        ArrayList<Integer> revBinary = new ArrayList<>(tempBinary);

        System.out.println("Binary: " + toBinary);
        System.out.println("Reverse: " + revBinary);
        if (revBinary.equals(toBinary))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
