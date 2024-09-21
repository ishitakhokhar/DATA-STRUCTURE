// Write a menu driven program to implement following operations on a circular
// queue using an Array
//  Insert
//  Delete
//  Display all elements of the queue

import java.util.Scanner;

class CirQueueMethod {

    int rear = -1;
    int first = -1;
    int arr[];
    int size;

    public CirQueueMethod(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void Insert(int num) {
        if (rear == num) {
            rear = 0;
        } else {
            rear++;
        }
        if (first == rear) {
            System.out.println("Overflow");
        }
        arr[rear] = num;
        if (first == -1) {
            first = 0;
        }
    }

    public int Delete() {
        if (first == -1) {
            System.out.println("Underflow");
            return 0;
        }
        int value = arr[first];
        if (first == rear) {
            first = -1;
            rear = -1;
        }
        if (first == size) {
            first = 0;
        } else {
            first++;
        }
        return value;
    }

    public void DISPLAY() {
        if (first <= rear) {
            for (int i = first; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        } else {
            // System.out.println("Queue");
            for (int i = first; i < size; i++) {
                System.out.println(arr[i]);
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}

public class Cirular_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        CirQueueMethod cu = new CirQueueMethod(size);
        cu.Insert(5);
        cu.Insert(6);
        cu.Insert(7);
        cu.Insert(8);
        System.out.println("Deleted value : " + cu.Delete());
        cu.DISPLAY();
    }
}
