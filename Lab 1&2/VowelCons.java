// Write a program to determine whether the entered character is vowel or not.

import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Letter : ");
        String letter = scanner.next();

        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") ||
           letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")) {
            System.out.println("Letter is vowel");
        } else {
            System.out.println("Letter is consonant");
        }

        scanner.close();
    }
}

