// Write a program to reverse a linked list.
class LinkedList3 {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.link != null) {
                last = last.link;
            }
            last.link = newNode;
        }
    }

    public void rev() {
        if (head == null || head.link == null) {
            return;
        }
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.link;
            currentNode.link = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;

        }
        head = prevNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node save = head;
            while (save != null) {
                System.out.println("Node : " + save.info);
                save = save.link;
            }
        }
    }

}

public class Reverse {
    public static void main(String[] args) {
        LinkedList3 l3 = new LinkedList3();
        l3.add(3);
        l3.add(5);
        l3.add(6);
        l3.add(7);

        System.out.println("original List:");
        l3.display();

        l3.rev();
        System.out.println("Reversed List");
        l3.display();
    }
}
