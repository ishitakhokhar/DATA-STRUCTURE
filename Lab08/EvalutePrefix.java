// // Write a program for evaluation of prefix Expression using Stack

import java.util.Scanner;
import java.util.Stack;

public class EvalutePrefix {
    public static int operation(int n1, int n2, char op) {
        if (op == '+') {
            return n1 + n2;
        } else if (op == '-') {
            return n1 - n2;
        } else if (op == '*') {
            return n1 * n2;
        } else if (op == '/') {
            return n1 / n2;
        } else {
            return n1 ^ n2;
        }
    }

    public static int evalute(String prefix) {
        Stack<Integer> st = new Stack<>();
        char temp;
        int n1, n2, value;
        int length = prefix.length();
        for (int i = length - 1; i >= 0; i--) {
            temp = prefix.charAt(i);
            if (Character.isDigit(temp)) {
                st.push(Character.getNumericValue(temp));
            } else {
                n1 = st.pop();
                n2 = st.pop();
                value = operation(n1, n2, temp);
                st.push(value);
            }

        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter prefix : ");
        String prefix = scanner.next();
        System.out.println("Ans : " + evalute(prefix));

    }
}


