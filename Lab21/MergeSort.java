
class Sort {
    public void merge(int arr[], int mid, int low, int high) {
        int i, j, k;
        int arr2[] = new int[high + 1];
        i = low;
        j = mid + 1;
        k = low;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                arr2[k] = arr[i];
                i++;
                k++;
            } else {
                arr2[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            arr2[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            arr2[k] = arr[j];
            k++;
            j++;

        }
        for (i = low; i <= high; i++) {
            arr[i] = arr2[i];
        }

    }

    public void mergeSort(int arr[], int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class MergeSort {
    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
        s.mergeSort(arr, 0, 7);
        System.out.println("Sorted array");
        s.print(arr);
    }
}