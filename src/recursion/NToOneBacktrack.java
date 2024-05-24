package recursion;

/*
 * print from N to 1 without using f(i-1)
 * use backtracking
 */

import java.io.IOException;

public class NToOneBacktrack {
    public static void main(String[] args) throws IOException {
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        printNToOneBacktrack(1, n);
    }
    public static void printNToOneBacktrack(int current, int n) {
        if (current > n) {
            return;
        }
        printNToOneBacktrack(current + 1, n);
        System.out.println(current);
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
