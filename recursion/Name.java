import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Print name n times using recursion
 */
public class Name {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printName(1,n);
    }

    private static void printName(int k, int n) {
        if(k>n) return;
        System.out.println("Hi Mom and Dad - "+k);
        printName(k + 1, n);
    }
}
/*
 * Time Complexity: O(n)
 * Space Complexity: Doesn't use array or anything
 * but, internally it uses stack space
 * Assume n == 3, stack would have: printName(1,3)
 *                                  printName(2,3)
 *                                  printName(3,3)
 */