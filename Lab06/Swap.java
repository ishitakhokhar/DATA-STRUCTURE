
// Write a program to swap two numbers using user-defines method.
import java.util.Scanner;

public class Swap {
    public static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
        System.out.println("After swapping first = " + first + " second = " + second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter second number : ");
        int second = scanner.nextInt();
        System.out.println("before swapping first = " + first + " second = " + second);
        swap(first, second);
        scanner.close();
    }
}
