package apniKaksha.MISC;

// anagram = 2 strings in which number of characters are repeats same number of time
// example = aab & baa are anagram, but bad & gfr are not anagram

public class anagrams {
    public static void main(String[] args) {

        String a = "aab";
        String b = "aba";

        // method 1 = O(n^2)
//        boolean isAnagram = false;
//        boolean[] isVisited = new boolean[b.length()];

//        if(a.length() == b.length()){
//            for (int i=0; i<a.length(); i++){
//                char check = a.charAt(i);
//                isAnagram = false;
//                for (int j=0; j<b.length(); j++){
//                    if (b.charAt(j) == check && !isVisited[j]){
//                        isVisited[j] = true;
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram){
//                    break;
//                }
//            }
//        }

        // method 2 = O(n)

//        boolean isAnagram = true;
//        int[] aLength = new int[256];
//        int[] bLength = new int[256];
//
//        for (char check : a.toCharArray()){
//            int index = (int) check;
//            aLength[index]++;
//        }
//
//        for (char check : b.toCharArray()){
//            int index = (int) check;
//            bLength[index]++;
//        }
//
//        for (int i=0; i<256; i++){
//            if(aLength[i] != bLength[i]){
//                isAnagram = false;
//                break;
//            }
//        }

        // method 3 = O(n), optimized of  method 2

        boolean isAnagram = true;
        int[] aLength = new int[256];

        for (char check : a.toCharArray()) {
            int index = check;
            aLength[index]++;
        }

        for (char check : b.toCharArray()) {
            int index = check;
            aLength[index]--;
        }

        for (int i = 0; i < 256; i++) {
            if (aLength[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
}
