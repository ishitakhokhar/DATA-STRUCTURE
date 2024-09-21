// Write a program to swap two consecutive nodes in the linked list. Don’t change
// the values of nodes, implement by changing the link of the nodes.
//  Input: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
//  Output: 2 → 1 → 4 → 3 → 6 → 5 → 8 → 7

class ListNode {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node head;

    public void addNode(int data) {
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

    public Node swapPairs(Node head) {
        if (head == null || head.link == null) {
            return head;
        }
        Node first = head;
        Node second = head.link;
        first.link = swapPairs(second.link);
        second.link = first;
        return second;
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

public class SwapNode {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        System.out.println("Original List:");
        list.display();

        list.head = list.swapPairs(list.head);

        System.out.print("List after swapping pairs ");
        list.display();
    }
}
