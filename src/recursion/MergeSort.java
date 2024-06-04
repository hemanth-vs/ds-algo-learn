package recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 23, 24, 25, 14, 2, 3, 6, 9 };
        mergeSort(arr, 0, arr.length - 1);
        Util.printArr(arr);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                i++;
                left++;
            } else {
                temp[i] = arr[right];
                i++;
                right++;
            }
        }
        while (left <= mid) {
            temp[i] = arr[left];
            i++;
            left++;
        }
        while (right <= high) {
            temp[i] = arr[right];
            i++;
            right++;
        }
        for (int j = low; j <= high; j++) {
            arr[j] = temp[j-low];
        }
    }
}

/*
 * Time Complexity: O(nlgn)
 * Space Complexity: O(n)
 */
