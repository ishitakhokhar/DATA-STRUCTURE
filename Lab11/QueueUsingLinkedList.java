// Write a program to implement queue using singly linked list.
class Node {
    int info;
    Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class Queue {
    Node rear;
    Node first;
    // public Node save = null;

    public Queue() {
        rear = first = null;
    }

    boolean isEmpty() {
        return rear == null && first == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            first = rear = newNode;
            return;
        }
        rear.link = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        Node temp = first;
        first = first.link;
        if (first == null) {
            rear = null;
        }
    }

    public void display() {
        Node save = first;
        while (save != null) {
            System.out.println("Node : " + save.info);
            save = save.link;
        }

    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(30);
        q.enqueue(45);
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
