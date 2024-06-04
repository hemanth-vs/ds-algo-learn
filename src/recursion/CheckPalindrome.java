package recursion;

/*
 * Given a string print true if palindrome, print false otherwise
 */

import java.io.IOException;

public class CheckPalindrome {
    public static void main(String[] args) throws IOException {
        String s = (String) BufferedReaderLocal.scanFunction("String");
        System.out.println(iterativePalindromeCheck(s));
        System.out.println(isPalindromeRecursionTwoPointer(0,s));
    }
    public static boolean iterativePalindromeCheck(String s) {
        int first = 0;
        int last = s.length() - 1;
        while(first<last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static boolean isPalindromeRecursionTwoPointer(int i, String s) {
        if (i>=s.length()/2) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPalindromeRecursionTwoPointer(i+1, s);
    }
}
/*
 * Time Complexity: n/2
 * Space Complexity: n/2
 */
