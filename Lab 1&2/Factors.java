// Write a program to find factors of a given number.
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        System.out.println("Factors of the number are:");
        for (int i = 1; i <= number; i++) {
             if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
