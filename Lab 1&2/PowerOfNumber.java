
// Write a program to find power of a number using loop.
import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base : ");
        int base = scanner.nextInt();
        System.out.println("Enter Power : ");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + power + " is " + result);
    }
}
