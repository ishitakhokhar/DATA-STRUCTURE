
//Write a program to delete duplicate numbers from an array.
import java.util.Scanner;

public class DuplicateNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array element : ");
        int num = scanner.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter number of element : ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; i < num; i++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number is" + arr[i]);
                }

            }

        }
    }

}
