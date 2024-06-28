
// Create methods to convert temperature from Celsius to Fahrenhit and vice
// versa. Take temperature input from user and call the appropriate conversion
// method.
import java.util.Scanner;

public class Temperature {

    public static double ctof(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double ftoc(double feharenhit) {
        return (feharenhit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature : ");
        float temp = scanner.nextFloat();
        System.out.println("Fahrenhit to celicus : " + ftoc(temp));
        System.out.println("Celicus to fahrenhit : " + ctof(temp));
    }
}
