// Write a program to find factorial of a number. (Using Recursion)

import java.util.Scanner;

public class FactorialRecursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        System.out.println("The value of factorIal is " + factorial(number));
        scanner.close();
    }
}
