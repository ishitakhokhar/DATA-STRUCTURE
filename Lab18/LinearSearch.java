
// Write a program to implement a Linear Search using Array.

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter number of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number to search : ");
        int search = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number not found");
        }
    }
}
