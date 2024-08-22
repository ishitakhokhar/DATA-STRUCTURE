// Write a menu driven program to implement following operations on the
// circular linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list.
//  Display all nodes.

class CLinkedList {
    class Node {
        int info;
        Node next;

        public Node(int data) {
            this.info = data;
            this.next = null;
        }
    }

    public Node first = null;
    public Node last = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = first;
            first = newNode;
            last.next = first;
        }
    }

    public void Delete(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node save = first;
        Node pred = save;
        while (save.info != data && save != last) {
            pred = save;
            save = save.next;
        }
        if (save.info != data) {
            System.out.println("Node not found");
            return;
        }
        if (first.info == data) {
            first = first.next;
            last.next = first;
        } else {
            pred.next = save.next;

        }
        if (save == last) {
            last = pred;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = first;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("List is Empty");
        }
        Node temp = first;
        do {
            System.out.println("Node : " + temp.info);
            temp = temp.next;
        } while (temp != first);
        // System.out.println("null");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLinkedList cl = new CLinkedList();
        cl.insertAtFirst(10);
        cl.insertAtFirst(20);
        cl.insertAtFirst(30);
        cl.insertAtLast(60);
        cl.insertAtLast(50);
        cl.Delete(20);
        cl.display();

        // cl.display();
    }
}
