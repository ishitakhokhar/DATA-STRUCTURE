
// Write a program for evaluation of postfix Expression using Stack.
import java.util.Scanner;
import java.util.Stack;

public class EvalutePostfix {

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

    public static int evalute(String postfix) {
        Stack<Integer> st = new Stack<>();
        char temp;
        int n1, n2, value;
        for (int i = 0; i < postfix.length(); i++) {
            temp = postfix.charAt(i);
            if (Character.isDigit(temp)) {
                st.push(Character.getNumericValue(temp));
            } else {
                n2 = st.pop();
                n1 = st.pop();
                value = operation(n1, n2, temp);
                st.push(value);
            }

        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postfix : ");
        String postfix = scanner.next();
        System.out.println("Ans : " + evalute(postfix));

    }
}
