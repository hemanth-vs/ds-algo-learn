/*
 * Find nth number Fibonacci number
 */

import java.io.IOException;

public class Fibonacci {
    public static void main(String[] args) throws IOException{
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        System.out.println(iterativeFibonacci(n));
        System.out.println(fibonacciRecursion(n));
    }
    public static int fibonacciRecursion(int n) {
        // if (n <= 0) return 0;
        // if (n == 1) return 1;
        if(n<=1) return n;
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
    public static int iterativeFibonacci(int n) {
        if (n==0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }
        int dp = 0;
        int p = 1;
        int ans = 0;
        for (int i = 2; i <=n; i++) {
            ans = dp + p;
            dp = p;
            p = ans;
        }
        return ans;
    }
}
/*
 * Time Complexity: O(2 to the power of n)
 * Space Complexity: ?
 */
