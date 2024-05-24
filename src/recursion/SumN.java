package recursion;

/*
 * Find sum of n numbers using recursion
 * Two ways: one - passing parameters recursively i.e. passing sum as parameter and printing it out at the base condition and returning it.
 * second - functional way: returning the sum at each step, at the base condition, returning 0 and building on top of that back at each return again.
 */
import java.io.IOException;

public class SumN {
    public static void main(String[] args) throws IOException{
        int n = (Integer) BufferedReaderLocal.scanFunction("int");
        sumNParameterised(n, 0);
        System.out.println(sumNFunctional(n));
    }
    public static void sumNParameterised(int current, int sum) {
        if(current < 1) {
            System.out.println(sum);
            return;
        }
        sumNParameterised(current - 1, sum + current);
    }
    public static int sumNFunctional(int current) {
        if(current < 1) return 0;
        return current + sumNFunctional(current - 1);
    }
}
/*
 * Time complexity:
 * Parametrised: O(n)
 * Functional: O(n)
 * Space complexity:
 * Parameterised: O(n)
 * Functional: O(n)
 */