
//How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a
//program to solve the above problem.
import java.util.Scanner;

class Stack1 {
    int size;
    char[] arr;
    int top;

    public Stack1(int n) {
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

    public char pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return ' ';
        } else {
            top--;
            return (arr[top + 1]);
        }

    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Recognize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size : ");
        int num = scanner.nextInt();
        System.out.println("Enter String : ");
        String s = scanner.next();
        Stack1 s1 = new Stack1(num);
        s1.push('c');
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'c') {
                s1.push(s.charAt(i));
                index++;
            } else {
                break;
            }
        }
        boolean flag = false;
        for (int i = index + 1; i < s.length(); i++) {
            if (s1.pop() == s.charAt(i)) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
