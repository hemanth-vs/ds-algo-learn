/*
 * print 1 to n
 * don't use +1 i.e. do not call f(i+1,n)
 * use i-1 unstead
 */

import java.io.IOException;

public class OneToNBacktrack {
    public static void main(String[] args) throws IOException {
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        printOneToNBacktrack(n);
        
    }
    public static void printOneToNBacktrack(int current) {
        if(current<1) return;
        printOneToNBacktrack(current - 1); //calling the function first
        System.out.println(current); //making sure it goes till the base function and from there this line starts executing thus printing 
                                        // from 1 to n
    }
}
/* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
