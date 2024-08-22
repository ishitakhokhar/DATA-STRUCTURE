// Write a program to implement Quick Sort using Array.

class QSort {
    public void quickSort(int[] k, int lb, int ub) {
        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = k[lb];
            boolean flag = true;

            while (flag) {
                i++;
                while (i < ub && k[i] < key) {
                    i++;
                }
                j--;
                while (j > lb && k[j] > key) {
                    j--;
                }
                if (i < j) {
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                } else {
                    flag = false;
                }
            }
            int temp = k[lb];
            k[lb] = k[j];
            k[j] = temp;
            quickSort(k, lb, j - 1);
            quickSort(k, j + 1, ub);
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        QSort s = new QSort();
        int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
        s.quickSort(arr, 0, 7);
        System.out.println("Sorted array");
        s.print(arr);
    }
}
