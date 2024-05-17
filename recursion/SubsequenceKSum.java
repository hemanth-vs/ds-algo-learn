/*
 * Given an array, print all the subsequences that produce sum 's'
 */

import java.util.ArrayList;

public class SubsequenceKSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1};
        int k = 2;
        ArrayList ds = new ArrayList<Integer>();
        subsequenceK(0, ds, arr, arr.length, 0, k);

        subsequenceKFunctional(0, ds, arr, arr.length, 0, k);

        System.out.println(subsequenceKCount(0, arr, arr.length, 0, k));

    }
    public static void subsequenceK(int i, ArrayList<Integer> ds, int[] arr, int n, int vSum, int k) {
        if(i==n) {
            if (vSum == k) System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        vSum+= arr[i];
        subsequenceK(i+1, ds, arr, n, vSum, k);

        vSum-=arr[i];
        ds.remove(ds.size()-1);
        subsequenceK(i+1, ds, arr, n, vSum, k);
    }

    public static boolean subsequenceKFunctional(int i, ArrayList<Integer> ds, int[] arr, int n, int vSum, int k) {
        if(i==n) {
            if (vSum == k) {
                System.out.println(ds);
                return true;
            }
            return false;
        }
        ds.add(arr[i]);
        if(subsequenceKFunctional(i+1, ds, arr, n, vSum+arr[i], k)) return true;
        ds.remove(ds.size()-1);
        if(subsequenceKFunctional(i+1, ds, arr, n, vSum, k)) return true;
        return false;
    }

    public static int subsequenceKCount(int i, int[] arr, int n, int vSum, int k) {
        if(i==n) {
            if (vSum == k) {
                return 1;
            }
            return 0;
        }
        int left = subsequenceKCount(i+1, arr, n, vSum+arr[i], k);
        int right = subsequenceKCount(i+1, arr, n, vSum, k);
        return left + right;
    }

}
/*
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */