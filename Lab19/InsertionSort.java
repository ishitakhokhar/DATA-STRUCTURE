//  Write a program to implement Insertion Sort using Array.

class Isort {
    public void insertionSort(int[] arr) {
        int i = 0;
        int j;
        int key;
        int temp;
        int len = arr.length;
        while (i < len) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
            arr[j + 1] = key;
            i++;
        }
    }

    public void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        Isort s = new Isort();
        int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
        s.insertionSort(arr);
        System.out.println("Sorted array");
        s.printarray(arr);
    }
}
