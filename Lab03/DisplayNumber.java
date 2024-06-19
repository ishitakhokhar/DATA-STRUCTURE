// Write a program to read and display n numbers using an array.

import java.util.Arrays;
import java.util.Scanner;

public class DisplayNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("]");
        scanner.close();
    }
}
