// . Write a program to calculate area of a Circle (A = πr2)
import  java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of radius : ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is : "+area);
        scanner.close();
        
    }
}
