// Write a program to calculate average of first n numbers.

import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];

        }
        int avg = sum / n;
        System.out.println("Avg of sum is : " + sum);
    }
}
