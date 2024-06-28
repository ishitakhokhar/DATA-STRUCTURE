
// Write a program to insert a number in an array that is already sorted in an
// ascending order.
import java.util.Scanner;

public class InsertSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter a value of number : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to insert : ");
        int num = sc.nextInt();
        int arr2[] = new int[n + 1];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] < num) {
                arr2[i] = arr[i];
            } else if (flag) {
                arr2[i] = num;
                flag = false;
                i--;
            } else {
                arr2[i + 1] = arr[i];
            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr2[i]);
        }

    }
}
