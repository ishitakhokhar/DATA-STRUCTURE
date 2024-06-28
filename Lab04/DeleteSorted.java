// Write a program to delete a number from an array that is already sorted in an
// ascending order.

import java.util.Scanner;

public class DeleteSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to delete : ");
        int num = sc.nextInt();
        int arr2[] = new int[n - 1];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] < num) {
                arr2[i] = arr[i];
            } else if (arr[i] == num) {
                continue;
            } else {
                arr2[i - 1] = arr[i];
            }

        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr2[i]);
        }
    }
}
