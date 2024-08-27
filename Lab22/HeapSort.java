// // Write a program to implement Heap Sort using Array.

class Heap {
    public void heapSort(int arr[]) {
        int n = arr.length;
        buildMaxHeap(arr);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public void heapify(int[] arr, int num, int i) {
        int maxindex = i;
        int leftchildren = 2 * i + 1;
        int rightchildren = 2 * i + 2;
        if (leftchildren < num && arr[leftchildren] > arr[maxindex]) {
            maxindex = leftchildren;
        }
        if (rightchildren < num && arr[rightchildren] > arr[maxindex]) {
            maxindex = rightchildren;
        }
        if (maxindex != i) {
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
            heapify(arr, num, maxindex);
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, -6, 3, 8, 7, -2, 0 };
        Heap heap = new Heap();
        heap.heapSort(arr);
        heap.print(arr);
    }
}
