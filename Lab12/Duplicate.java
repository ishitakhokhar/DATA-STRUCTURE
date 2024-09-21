// Write a program to remove the duplicates nodes from given sorted Linked List.
//  Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27
//  Output: 1 → 6 → 13 → 27

class LinkedListNew {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node head;

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

    public Node duplicates(Node data) {
        if (head == null || head.link == null) {
            return head;
        }
        Node curr = head;
        while (curr != null && curr.link != null) {
            if (curr.info == curr.link.info) {
                curr.link = curr.link.link;
            } else {
                curr = curr.link;
            }
        }
        return head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node save = head;
            while (save != null) {
                System.out.println("Node : " + save.info);
                save = save.link;
            }
        }
    }
}

public class Duplicate {
    public static void main(String[] args) {
        LinkedListNew list = new LinkedListNew();
        list.add(1);
        list.add(1);
        list.add(6);
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(27);
        list.add(27);
        System.out.println("Original List:");
        list.display();

        list.head = list.duplicates(list.head);

        System.out.println("List after delete duplicate pairs:");
        list.display();
    }
}
