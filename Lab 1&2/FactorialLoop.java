// Write a program to find factorial of a number. (Using Loop)
import java.util.Scanner;
public class FactorialLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();
        int fact=1;
        int i=1;
        while(i<=number){
            fact*=i;
            i++;
        }
        System.out.println("Factorial of "+number + " is :" +fact);
    }
}
