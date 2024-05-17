/*
 * Find factorial of n using recursion
 */

import java.io.IOException;

public class FactorialN {
    public static void main(String[] args) throws IOException{
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        System.out.println(fact(n));
        parameterisedFact(n, 1);
        
    }
    public static int fact(int n) {
        if (n == 1) return 1;
        return n*fact(n-1);
    }
    public static void parameterisedFact(int n, int product) {
        if(n==1) {
            System.out.println(product);
            return;
        }
        parameterisedFact(n-1, product*n);
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
