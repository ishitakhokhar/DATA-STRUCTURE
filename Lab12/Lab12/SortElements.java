// Write a program to sort elements of a linked list
class Elements {
    Node head = null;

    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node sortMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        if (a.info < b.info) {
            result = a;
            result.link = sortMerge(a.link, b);
        } else {
            result = b;
            result.link = sortMerge(a, b.link);
        }
        return result;
    }

    public Node mergeSort(Node h) {
        if (h == null || h.link == null) {
            return h;
        }
        Node middle = getMiddle(h);
        Node nextToMiddle = middle.link;
        middle.link = null;
        Node left = mergeSort(h);
        Node right = mergeSort(nextToMiddle);
        Node sortList = sortMerge(left, right);
        return sortList;
    }

    public Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.link != null && fast.link.link != null) {
            slow = slow.link;
            fast = fast.link.link;
        }
        return slow;
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.link = head;
        head = newNode;
    }

    public void print(Node save) {
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.link;
        }
        System.out.println();
    }
}

public class SortElements {
    public static void main(String[] args) {
        Elements elements = new Elements();
        elements.push(2);
        elements.push(8);
        elements.push(9);
        elements.push(1);

        System.out.println("Original list");
        elements.print(elements.head);

        elements.head = elements.mergeSort(elements.head);

        System.out.println("Sorted list");
        elements.print(elements.head);
    }
}
