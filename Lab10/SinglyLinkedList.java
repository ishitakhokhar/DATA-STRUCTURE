
import java.util.Scanner;

// Write a menu driven program to implement following operations on the singly
// linked list.
//  Insert a node at the front of the linked list.
//  Display all nodes.
//  Delete a first node of the linked list.
//  Insert a node at the end of the linked list.
//  Delete a last node of the linked list.
//  Delete a node from specified position.

class LinkedList {
        class Node {
                int info;
                Node link;

                public Node(int data) {
                        this.info = data;
                        this.link = null;
                }
        }

        public Node first = null;

        public void insertAtFirst(int data) {
                Node newNode = new Node(data);
                if (first == null) {
                        first = newNode;
                        return;
                }
                Node temp = first;
                first = newNode;
                first.link = temp;
        }

        public void insertAtLast(int data) {
                Node newNode = new Node(data);
                if (first == null) {
                        first = newNode;
                        return;
                } else {
                        Node last = first;
                        while (last.link != null) {
                                last = last.link;
                        }
                        last.link = newNode;
                }
        }

        public void deletAtposition(int data) {
                if (first == null) {
                        System.out.println("Empty");
                        return;
                }
                Node temp = first;
                Node prev = null;
                if (temp.info == data) {
                        first = temp.link;
                        return;
                }
                while (temp != null && temp.info != data) {
                        prev = temp;
                        temp = temp.link;
                }
                if (temp == null) {
                        System.out.println("Node not found");
                        return;
                }
        }

        public void deleteAtFirst() {
                if (first == null) {
                        System.out.println("Empty");
                }
                first = first.link;
        }

        public void deleteAtLast() {
                if (first == null) {
                        System.out.println("Empty");
                }
                Node temp = first;
                Node prev = null;
                while (temp.link != null) {
                        prev = temp;
                        temp = temp.link;
                }
                prev.link = null;
        }

        public void display() {
                Node save = first;
                while (save != null) {
                        System.out.println("Node : " + save.info);
                        save = save.link;
                }

        }
}

public class SinglyLinkedList {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                LinkedList l1 = new LinkedList();
                l1.insertAtFirst(1);
                l1.insertAtFirst(2);
                l1.deleteAtLast();
                l1.display();
        }
}