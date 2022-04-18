package apniKaksha.NumberSystem;

import java.util.Scanner;

public class decimal_to_binary {
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
////        System.out.println(result);
//
//        // print reverse
//        int rev_length = result.length();
//        String reverse_str = "";
//
//        for(int i = rev_length - 1; i >= 0; i--)
//
//            // reverse_str = reverse_str + result.charAt(i); // can use this also
//            reverse_str = reverse_str.concat(String.valueOf(result.charAt(i)));
//
//        System.out.println("Binary: " + reverse_str);


        // method - 2 --> not using strings
        int i = 1;
        int remainder;
        int binary = 0;

        while (number != 0) {
            remainder = number % 2;
            binary = binary + i * remainder;
            number = number / 2;
            i = i * 10;
        }
        System.out.print(binary);

        // method - 3 --> using arrayList & more simple logic to convert Dec to Bin
//        ArrayList<Integer> binary = new ArrayList<>();
//        while (number > 0) {
//            binary.add(number % 2);
//            number = number / 2;
//        }
//
//        Collections.reverse(binary);
//
//        for (int i = 0; i < binary.size(); i++)
//            System.out.print(binary.get(i));
    }
}
