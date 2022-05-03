public class BinaryPalindrome {
    public static void main(String[] args) {
        int num = 5;
        StringBuilder str = new StringBuilder(Integer.toBinaryString(num));
        StringBuilder rev = new StringBuilder(str).reverse();

        if(str.toString().equals(rev.toString()))
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}