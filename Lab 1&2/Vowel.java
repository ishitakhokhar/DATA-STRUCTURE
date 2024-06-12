
import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char : ");
        char c = scanner.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("char is vowel");
        } else {
            System.out.println("Char is consonant");
        }
    }

}
