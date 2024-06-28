
// Write a program to insert a number at a given location in an array.
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter a value of number : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter location : ");
        int location = sc.nextInt();
        System.out.println("Enter number to insert : ");
        int num = sc.nextInt();
        int arr2[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < location) {
                arr2[i] = arr[i];
            } else if (i == location) {
                arr2[i] = num;
            } else if (i > location) {
                arr2[i] = arr[i - 1];
            }
        }
        System.out.println("After insertion : ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr2[i]);
        }
    }
}
