// Write a program to count the number of nodes in a singly circularly linked list.

class LinkedList2 {
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
        if (first == null) {
            first = newNode;
            first.link = first;
        } else {
            Node temp = first;
            while (temp.link != first) {
                temp = temp.link;
            }
            temp.link = newNode;
            newNode.link = first;
        }
    }

    public int countNode() {
        if (first == null) {
            return 0;
        }
        int count = 1;
        Node save = first;
        while (save.link != first) {
            save = save.link;
            count += 1;
        }
        return count;
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node save = first;
            while (save != first) {
                System.out.println("Node : " + save.info);
                save = save.link;
            }
        }
    }
}

public class CountNodes {
    public static void main(String[] args) {
        LinkedList2 l2 = new LinkedList2();
        l2.addNode(2);
        l2.addNode(4);
        l2.addNode(5);
        l2.addNode(7);
        System.out.println("Number of nodes : " + l2.countNode());
        l2.display();
    }
}
