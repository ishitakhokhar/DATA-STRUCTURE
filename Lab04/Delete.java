// Write a program to delete a number from a given location in an array.

import java.util.Scanner;

public class Delete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter location : ");
        int location = sc.nextInt();
        System.out.println("Enter number to delete : ");
        int arr2[] = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < location) {
                arr2[i] = arr[i];
            } else if (i > location) {
                arr2[i - 1] = arr[i];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr2[i]);
        }
    }

}
