// Write a program to implement Shell Sort using Array.

class Shell {
    public int shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                    }
                }
            }
        }
        return 0;
    }

    public void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ShellSort {
    public static void main(String[] args) {
        Shell s = new Shell();
        int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
        s.shellSort(arr);
        System.out.println("Sorted array");
        s.print(arr);
    }
}
