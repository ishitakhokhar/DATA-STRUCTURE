
// WAP to check whether 2 singly linked lists are same or not.

class SLinkedList {
    Node head;

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    boolean isSame(SLinkedList l) {
        Node a = this.head, b = l.head;
        while (a != null && b != null) {
            if (a.data != b.data) {
                return false;

            }
            a = a.link;
            b = b.link;

        }
        return (a == null && b == null);
    }

    void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.link = head;
        head = newNode;
    }
}

public class LinkedListSameOrNot {
    public static void main(String[] args) {
        SLinkedList s1 = new SLinkedList();
        SLinkedList s2 = new SLinkedList();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        s2.push(1);
        s2.push(2);
        s2.push(3);

        if (s1.isSame(s2) == true) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }

    }
}
