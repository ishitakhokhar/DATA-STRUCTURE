// Write a program to construct a binary tree from given postorder and preorder
// traversal sequence.
class Node {
    int key;
    Node left, right;

    public Node(int data) {
        this.key = data;
        this.left = this.right = null;
    }
}

public class Tree_From_PrePost {
    int i = 0, j = 0;

    Node TreeOrder(int pre[], int post[], int size) {
        if (i >= size || j >= size) {
            return null;
        }
        Node root = new Node(pre[i]);
        i++;
        if (root.key != post[j]) {
            root.left = TreeOrder(pre, post, size);
        }
        if (root.key != post[j]) {
            root.right = TreeOrder(pre, post, size);
        }
        j++;
        return root;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int pre[] = { 1, 2, 4, 5, 3 };
        int post[] = { 2, 5, 4, 3, 1 };
        Tree_From_PrePost tree = new Tree_From_PrePost();
        int size = pre.length;
        Node root = tree.TreeOrder(pre, post, size);
        tree.inorder(root);

    }
}
