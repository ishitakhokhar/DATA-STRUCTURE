
class Node {
    int key;
    Node left, right;

    public Node(int data) {
        this.key = data;
        this.left = this.right = null;
    }
}

class Tree {
    Node root;

    boolean isSymmetric() {
        return isMirror(root, root);
    }

    boolean isMirror(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null && a.key == b.key) {
            return (isMirror(a.left, b.right) && isMirror(a.right, b.left));
        }
        return false;
    }
}

public class SymmetricTree {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(8);
        t.root.left = new Node(5);
        t.root.right = new Node(5);
        t.root.left.left = new Node(3);
        t.root.left.right = new Node(6);
        t.root.right.left = new Node(6);
        t.root.right.right = new Node(3);

        if (t.isSymmetric()) {
            System.out.println("Trees are Symmetric");
        } else {
            System.out.println("Tree are not Symmetric");
        }
    }
}
