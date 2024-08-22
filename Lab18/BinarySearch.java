//  Write a program to implement a Binary Search using Array.

import java.util.Scanner;

class find {
    public static int search(int[] arr, int low, int high, int val) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter sorted array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to search");
        int val = scanner.nextInt();
        int result = find.search(arr, 0, size - 1, val);

        if (result == -1) {
            System.out.println("value not found");
        } else {
            System.out.println("Value found");
        }
    }
}
