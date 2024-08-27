
//Tree
import java.util.Scanner;

class Node {
    int key;
    Node right;
    Node left;

    public Node(int data) {
        key = data;
        left = null;
        right = null;
    }
}

class TreeGeneration {
    public Node generateTree(int index, int[] arr) {
        if (index >= arr.length) {
            return null;
        }
        Node temp = new Node(arr[index]);
        temp.left = generateTree(index * 2 + 1, arr);
        temp.right = generateTree(index * 2 + 2, arr);
        return temp;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;

        } else {
            System.out.println(root.key);
        }
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
    }
}

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        TreeGeneration tg = new TreeGeneration();
        Node root = tg.generateTree(0, arr);

        System.out.println("Preorder Traversal");
        tg.preorder(root);
    }
}
