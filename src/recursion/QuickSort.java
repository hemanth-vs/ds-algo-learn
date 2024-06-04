package recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 4,6,2,5,7,9,1,3};
        quickSortDescending(arr, 0, arr.length - 1);
        Util.printArr(arr);
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int partitionIndex = partitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }
    public static int partitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j) {
            while (i<=high && arr[i]<=pivot) {
                i++;
            }
            while (j>=low && arr[j]>pivot) {
                j--;
            }
            if(i<j) Util.swapArrElements(i, j, arr);
        }
        Util.swapArrElements(low, j, arr);
        return j;
    }
    public static void quickSortDescending(int[] arr, int low, int high) {
        if(low<high) {
            int partitionIndex = partitionIndexDescending(arr, low, high);
            quickSortDescending(arr, low, partitionIndex - 1);
            quickSortDescending(arr, partitionIndex + 1, high);
        }
    }
    public static int partitionIndexDescending(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j) {
            while (i<=high && arr[i]>=pivot) {
                i++;
            }
            while (j>=low && arr[j]<pivot) {
                j--;
            }
            if(i<j) Util.swapArrElements(i, j, arr);
        }
        Util.swapArrElements(low, j, arr);
        return j;
    }
}
