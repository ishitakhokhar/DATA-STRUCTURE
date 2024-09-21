// Write a program to merge two unsorted arrays.

import java.util.Scanner;

public class MergeArray {
    public static int[] mergeArray(int n1[], int n2[]) {
        int length1 = n1.length;
        int length2 = n2.length;
        int mergeArray[] = new int[length1 + length2];
        System.arraycopy(n1, 0, mergeArray, 0, length1);
        System.arraycopy(n2, 0, mergeArray, length1, length2);
        return mergeArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first array : ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter element in first array : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter second array : ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter element in second array : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] MergeArray = mergeArray(arr1, arr2);
        System.out.println("Mearge array is : ");
        for (int i : MergeArray) {
            System.out.println(i);
        }
        scanner.close();
    }
}
