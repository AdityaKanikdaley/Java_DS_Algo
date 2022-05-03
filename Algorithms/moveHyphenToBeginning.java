public class moveHyphenToBeginning {
    public static void main(String[] args) {
        String str = "Aditya_Is_Very_Good";
        char[] s = str.toCharArray();
        int i = s.length-1;
        for(int j=i; j>=0; j--) {
            if(s[j] != '_') {
                char temp = s[j];
                s[j] = s[i];
                s[i] = temp;

                i--;
            }
        }

        System.out.println(String.valueOf(s));
    }
}
