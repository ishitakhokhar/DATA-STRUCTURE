//Write a menu driven program to implement following operations on the Stack
//using an Array
//PUSH, POP, DISPLAY
// PEEP, CHANGE

import java.util.Scanner;

class Stack1 {
    int size;
    int[] arr;
    int top;

    public Stack1(int n) {
        arr = new int[n];
        top = -1;
    }

    public void push(int n) {
        this.size = n;
        if (top >= size) {
            System.out.println("Stack overflow");
        } else {
            top += 1;
            arr[top] = n;
            return;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Satcak underflow");
            return -1;
        } else {
            top--;
            return (arr[top + 1]);
        }

    }

    public int peep() {
        if (top - size + 1 <= 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return (arr[top - size + 1]);
        }
    }

    void change(int i, int num) {
        if (top - i + 1 <= 0) {
            System.out.println("Stack underflow");
            return;
        } else {
            arr[top - i + 1] = num;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        Stack1 s = new Stack1(n);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.peep();
        s.change(20, 30);
        s.display();

    }
}
