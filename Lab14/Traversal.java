// Write a menu driven program to implement Binary Search Tree (BST) & perform
// following operations
//  Preorder Traversal, Postorder Traversal, Inorder Traversal

class Tra {
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int data) {
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.key) {
            root.left = insert(root.left, data);
        } else if (data > root.key) {
            root.right = insert(root.right, data);

        }
        return root;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.key + " ");
        inorder(root.right);
    }

    public void Postorder(Node root) {
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.key + " ");

    }

    public Node getRoot() {
        return root;
    }
}

public class Traversal {
    public static void main(String[] args) {
        Tra tra = new Tra();
        int[] values = { 50, 40, 35, 47, 68, 23, 49, 67 };
        for (int value : values) {
            tra.insert(value);
        }
        System.out.println("Preorder traversal : ");
        tra.preorder(tra.getRoot());
        System.out.println("Inorder traversal : ");
        tra.inorder(tra.getRoot());
        System.out.println("Postorder traversal : ");
        tra.Postorder(tra.getRoot());
    }
}
