package recursion;

/*
 * print n to 1 using recursion
 */

import java.io.IOException;

public class NToOne {
    public static void main(String[] args) throws IOException{
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        printNToOne(n);
    }
    public static void printNToOne(int current) {
        if(current <= 0) return;
        System.out.println(current);
        printNToOne(current-1);
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */