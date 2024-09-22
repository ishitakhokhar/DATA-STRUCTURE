// WAP to find the smallest and largest elements in the Binary Search Tree
class Node {
    int key;
    Node left, right;

    public Node(int data) {
        this.key = data;
        this.left = right = null;
    }
}

class Tree {
    Node root;

    public Node minValue(Node root) {
        if (root.left == null) {
            return root;
        }
        return minValue(root.left);
    }

    public Node maxValue(Node root) {
        if (root.right == null) {
            return root;
        }
        return maxValue(root.right);
    }
}

public class Smallest_LargestNumber {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(3);
        t.root.left = new Node(2);
        t.root.right = new Node(4);
        t.root.left.left = new Node(1);

        System.out.println("Smallest value: " + t.minValue(t.root).key);
        System.out.println("Largest value: " + t.maxValue(t.root).key);
    }
}
