
class Node {
    int val;
    Node left, right;

    public Node(int data) {
        this.val = data;
        this.left = this.right = null;
    }
}

class Tree {
    Node root1, root2;

    boolean identicalTress(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null)
            return (p.val == q.val && identicalTress(p.left, q.left) && identicalTress(p.right, q.right));
        return false;
    }
}

public class Same_Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root1 = new Node(3);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(4);
        tree.root1.left.right = new Node(1);

        tree.root2 = new Node(3);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(4);
        tree.root2.left.right = new Node(1);

        if (tree.identicalTress(tree.root1, tree.root2)) {
            System.out.println("Both tree are identical");
        } else {
            System.out.println("Both tree are not identical");
        }
    }
}
