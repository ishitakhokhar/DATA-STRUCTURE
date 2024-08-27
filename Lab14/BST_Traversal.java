
// following operations
// Insert a node, Delete a node, Search a node

class BST {
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

    public BST() {
        root = null;
    }

    // INSERT
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

    // DELETE
    public Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (root.key > data) {
            root.left = delete(root.left, data);
        } else if (root.key < data) {
            root.right = delete(root.right, data);
        } else {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }
            Node succ = getSuccessor(root);
            root.key = succ.key;
            root.right = delete(root.right, succ.key);
        }
        return root;
    }

    public Node getSuccessor(Node curr) {
        curr = curr.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + " ");
            inorder(root.right);
        }
    }

    boolean search(int data) {
        return SearchResult(root, data);
    }

    boolean SearchResult(Node root, int data) {
        if (root == null) {
            return false;
        } else if (data == root.key) {
            return true;
        } else if (data > root.key) {
            return SearchResult(root.right, data);
        } else {
            return SearchResult(root.left, data);
        }
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public Node getRoot() {
        return root;
    }
}

public class BST_Traversal {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] values = { 50, 40, 35, 47, 68, 23, 49, 67 };
        for (int value : values) {
            bst.insert(value);
        }
        System.out.println("Preorder traversal : ");
        bst.preorder(bst.getRoot());
        System.out.println();
        System.out.println("Inorder traversal : ");
        bst.inorder(bst.getRoot());
        bst.delete(bst.root, 40);
        bst.delete(bst.root, 49);

        System.out.println("After deletions");
        System.out.println("Preorder traversal : ");
        bst.preorder(bst.getRoot());
        System.out.println();
        System.out.println("Inorder traversal : ");
        bst.inorder(bst.getRoot());

        int[] searchValues = { 50, 40, 67 };
        System.out.println("Searching for nodes:");
        for (int value : searchValues) {
            boolean found = bst.search(value);
            if (found) {
                System.out.println(value + " found in the tree.");
            } else {
                System.out.println(value + " not found in the tree.");
            }
        }

    }
}
