// Write a program to find position of the smallest number & the largest number
// from given n numbers.

import java.util.Scanner;

public class SmallNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int number = scanner.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[1];
        int minPosition = 0;
        int maxPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        System.out.println("Position of smallest number is " + minPosition + "&Position of largest number is " + maxPosition);
        scanner.close();
    }
}
