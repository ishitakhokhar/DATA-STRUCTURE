//  WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
                System.out.println("Sum of serirs" + sum);
            }
        }
    }

}
