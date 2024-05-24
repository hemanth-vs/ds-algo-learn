package recursion;

/*
 * reverse an array using recursion
 */

public class ReverseArray {
    static int[] arr;
    public static void main(String[] args) {
        arr = new int[]{1,3,2,5,4};
        Util.printArr(arr);
        iterativeReversal();
        Util.printArr(arr);
        iterativeReversal();
        recursiveReversal(0, arr.length-1);
        Util.printArr(arr);

        int[] arr2 = new int[]{1,98,32,45,64,56};
        recursiveOnePointer(0, arr2);
        Util.printArr(arr2);

    }
    public static void swapArrElements(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void swapArrElements(int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void iterativeReversal() {
        int first = 0;
        int last = arr.length - 1;
        while(first<last) {
            swapArrElements(first, last);
            first++;
            last--;
        }
    }
    public static void recursiveReversal(int first, int last) {
        if (first >= last) return;
        swapArrElements(first, last);
        recursiveReversal(first+1, last - 1);
    }
    public static void recursiveOnePointer(int i, int[] arr) {
        if(i>=arr.length/2) return;
        swapArrElements(i, arr.length-i-1, arr);
        recursiveOnePointer(i+1, arr);
    }
    
}
