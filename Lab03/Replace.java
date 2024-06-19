// Read n numbers in an array then read two different numbers, replace 1st
// number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1) {
                arr[i] = num2;
                System.out.println("Index=" + i);
            }
        }
        System.out.println("Final array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
