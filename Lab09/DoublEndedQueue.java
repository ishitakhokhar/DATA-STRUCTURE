
import java.util.Scanner;

// Write a menu driven program to implement following operations on the
// Doubled Ended Queue using an Array
//  Insert at front end, Insert at rear end
//  Delete from front end, Delete from rear end
//  Display all elements of the queue

class DQueueMethod {

    int rear = -1;
    int first = -1;
    int arr[];
    int size;

    public DQueueMethod(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void InsertFront(int y) {
        if (first == 0) {
            System.out.println("Overflow");
            return;
        }
        if (first == -1) {
            first = 0;
            rear = 0;
        } else {
            first--;
        }
        arr[first] = y;
    }

    public void ENQUEUE(int y) {
        if (rear >= size) {
            System.out.println("Overflow");
            return;

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

    public int Deleterear() {
        if (rear == -1) {
            System.out.println("Underflow");
        }
        int value = arr[rear];
        if (rear == first) {
            rear = -1;
            first = -1;
        } else {
            rear--;
        }
        return value;
    }

    public void Display() {
        if (first <= rear) {
            for (int i = first; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = first; i < size; i++) {
                System.out.println(arr[i]);
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class DoublEndedQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        DQueueMethod qu = new DQueueMethod(size);
        qu.InsertFront(40);
        qu.ENQUEUE(10);
        qu.ENQUEUE(20); 
        System.out.println(qu.DEQUEUE());
        qu.Display();
    }
}
