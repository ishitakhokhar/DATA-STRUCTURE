// WAP to sort the N names in an alphabetical order

import java.util.Arrays;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        int n = scanner.nextInt();
        String name[] = new String[n];
        System.out.println("Enter string : ");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            name[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(name));
    }

}
