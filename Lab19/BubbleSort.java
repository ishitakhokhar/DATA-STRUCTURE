// Write a program to implement Bubble using Array.

class Sort {
    public void sort(int[] arr) {
        int i, j;
        boolean change;
        for (i = 0; i < arr.length - 1; i++) {
            change = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    change = true;
                }
            }
            if (change == false)
                break;
        }

    }

    public void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Sort s = new Sort();
        int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
        s.sort(arr);
        System.out.println("Sorted array");
        s.printarray(arr);
    }
}
