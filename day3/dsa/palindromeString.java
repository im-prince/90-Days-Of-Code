public class palindromeString {

    public static void main(String[] args) {
        String s = "abab";


        System.out.println(Palindrome(s,0,s.length()-1));
    }

    static boolean Palindrome(String s, int left , int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) == s.charAt(right)) {
             return Palindrome(s, left+1, right-1);
        }
        return false;


    }

}
