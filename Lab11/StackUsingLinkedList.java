//  Write a program to implement stack using singly linked list

class Node {
    int info;
    Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class Stack1 {
    // int size;
    // int[] arr;
    int top;
    public Node first = null;

    public Stack1() {
        // arr = new int[n];
        top = -1;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            top++;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            top++;
            save.link = newNode;
        }
    }

    public void pop() {
        if (first == null) {
            System.out.println("Empty");
        }
        Node stack = first;
        Node prev = null;
        while (stack.link != null) {
            prev = stack;
            stack = stack.link;

        }
        top--;
        prev.link = null;
    }

    public int peep(int data) {
        if (top - data + 1 <= 0) {
            System.out.println("Stack under flow");
            return -1;
        } else {
            Node save = first;
            int i = 0;
            while (i < top - data + 1) {
                save = save.link;
                i++;
            }
            return save.info;
        }
    }

    public void display() {
        Node save = first;
        // System.out.println(save.info);
        // System.out.println(save.link.info);
        while (save != null) {
            System.out.println("Node : " + save.info);
            save = save.link;
        }

    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(5);
        s.push(7);
        s.push(9);
        s.pop();
        s.display();
    }
}
