/*
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};
        List<Integer> operations = new ArrayList<>();
        //List<List<Integer>> entireLists = new ArrayList<>();
        subsequencePrint(0, arr, operations, arr.length);
    }
    public static void subsequencePrint(int index, int[] arr, List<Integer> operations, int n) {
        if(index>=n) {
            System.out.println(operations);
            return;
        }
        operations.add(arr[index]);
        subsequencePrint(index+1, arr, operations, n);
        operations.remove(operations.size()-1);
        subsequencePrint(index+1, arr, operations, n);
    }
}

/*
 * Time complexity: O(2^n  * n)
 * recursion tree - repeated/invoked 2 times for each element, n is the size of the array, so 2^n
 * and n for printing the array 
 * 
 * Space complexity: O(n)
 * depth of the recursion tree at any point is not greater than 3 for the given example
 * it's gonna be 'n' - n levels for a given n-sized input
 */
