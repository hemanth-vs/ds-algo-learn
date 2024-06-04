package recursion;

/*
 * print 1 to n using recursion
 */

import java.io.IOException;

public class OneToN {
    public static void main(String[] args) throws IOException{
        int n = (Integer)BufferedReaderLocal.scanFunction("int");
        printOneToN(1, n);
    }
    public static void printOneToN(int current, int n) {
        if(current>n) return;
        System.out.println(current);
        printOneToN(current + 1, n);
    }
}
