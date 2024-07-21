
// Write a program to convert infix notation to postfix notation using stack.
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static int stackG(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        } else if (c == '^') {
            return 5;
        } else if (c >= 'a' && c <= 'z') {
            return 8;
        } else {
            return 0;
        }
    }

    public static int inputF(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '^') {
            return 6;
        } else if (c >= 'a' && c <= 'z') {
            return 7;
        } else if (c == '(') {
            return 9;
        } else {
            return 0;
        }
    }

    public static int Rank(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return -1;
        } else {
            return 1;
        }
    }

    public static void postfix(String s) {
        char next;
        s += ')';
        int rank = 0;
        String polish = "";
        char temp;

        Stack<Character> st = new Stack<>();

        st.push('(');
        for (int i = 0; i < s.length(); i++) {
            next = s.charAt(i);

            while (stackG(st.peek()) > inputF(next)) {

                temp = st.pop();

                polish = polish + temp;
                rank = rank + Rank(temp);
                if (rank < 1) {
                    System.out.println("Invalid");
                    return;
                }
            }
            if (stackG(st.peek()) != inputF(next)) {
                st.push(next);
            } else {
                st.pop();
            }

        }
        if (!st.isEmpty() || rank != 1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
            System.out.println(polish);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = scanner.next();
        postfix(s);

    }
}
