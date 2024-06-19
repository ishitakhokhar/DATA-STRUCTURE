// Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element");
        int number = scanner.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of element is : " + sum);
        scanner.close();

    }
}
