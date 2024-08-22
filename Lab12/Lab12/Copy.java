// Write a program to copy a linked list.

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

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (this.first == null) {
            this.first = newNode;
        } else {
            Node temp = this.first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void display() {
        // System.out.println(this.first.info);
        if (this.first == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node save = this.first;
            while (save != null) {
                System.out.println("Node : " + save.info);
                save = save.link;
            }
        }
    }

    public static LinkedList copyLl(LinkedList l1) {

        if (l1.first == null) {
            return null;
        } else {
            // LinkedList l1 = new LinkedList();
            LinkedList l2 = new LinkedList();
            Node save = l1.first;
            while (save != null) {
                l2.addNode(save.info);
                save = save.link;
            }
            return l2;
        }

    }
}

public class Copy {

    public static void main(String[] args) {
        LinkedList orignaLinkedList = new LinkedList();
        orignaLinkedList.addNode(10);
        orignaLinkedList.addNode(20);
        orignaLinkedList.addNode(30);
        orignaLinkedList.addNode(40);
        LinkedList copy = LinkedList.copyLl(orignaLinkedList);
        copy.display();
    }
}
