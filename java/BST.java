//Username= Ayush07415
//Aim= Binary serach tree
//Date=4/10/2025

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BST {
    Node root;

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values for the BST:");
        for (int i = 0; i < n; i++) {
            tree.root = tree.insert(tree.root, sc.nextInt());
        }

        System.out.println("\nInorder Traversal of BST (sorted order):");
        tree.inorder(tree.root);
        System.out.println();

        sc.close();
    }
}
