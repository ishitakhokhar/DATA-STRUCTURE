
// Write a menu driven program to implement following operations on the Queue
// using an Array
// ENQUEUE
// DEQUEUE
// DISPLAY
import java.util.Scanner;

class QueueMethod {

    int rear = -1;
    int first = -1;
    int arr[];
    int size;

    public QueueMethod(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void ENQUEUE(int y) {
        if (rear >= y) {
            System.out.println("Overflow");
        }
        rear++;
        arr[rear] = y;

        if (first == -1) {
            first = 0;
        }
    }

    public int DEQUEUE() {
        if (first == -1) {
            System.out.println("Underflow");
            return -1;
        }
        int value = arr[first];
        if (first == rear) {
            first = -1;
            rear = -1;
        } else {
            first++;
        }
        return value;
    }

    public void DISPLAY() {
        if (first == -1) {
            System.out.println("Underflow");
        }
        for (int i = first; i <= rear; i++) {
            System.err.println(arr[i]);
        }
    }

}

public class Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        QueueMethod qu = new QueueMethod(size);
        qu.ENQUEUE(5);
        qu.ENQUEUE(6);
        qu.ENQUEUE(7);
        qu.ENQUEUE(8);
        System.out.println("Deleted value : " + qu.DEQUEUE());
        qu.DISPLAY();
    }
}
