import java.util.Arrays;

public class Util {
    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void swapArrElements(int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
