
//  Write a program to determine if an input character string is of the form aibi
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.
import java.util.Scanner;

class Stack {
    int size;
    char[] arr;
    int top;

    public Stack(int n) {
        arr = new char[n];
        top = -1;
    }

    public void push(char n) {
        this.size = n;
        if (top >= size) {
            System.out.println("Stack overflow");
        } else {
            top += 1;
            arr[top] = n;
            return;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = scanner.nextInt();
        Stack s1 = new Stack(n);
        Stack s2 = new Stack(n);
        System.out.println("Enter String : ");
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                s1.push(s.charAt(i));
            } else if (s.charAt(i) == 'b') {
                s2.push(s.charAt(i));
            }
        }
        if (s1.top == s2.top) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
