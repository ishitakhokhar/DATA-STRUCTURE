//WAP to replace lowercase characters by uppercase & vice-versa in a user specified
//string.

import java.util.Scanner;

public class LowerUpperCase {

    public static String Case(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += (char) ((int) ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                ans += (char) ((int) ch + 32);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = scanner.nextLine();
        String output = Case(s);
        System.out.println(output);
    }

}
