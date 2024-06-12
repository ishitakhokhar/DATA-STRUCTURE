// Write a program to find whether a number is odd or even
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
        scanner.close();
    }
    
}
