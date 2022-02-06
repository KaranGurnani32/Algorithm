package binarytreepractice;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("inorder : ");
        inorder(root);
        System.out.println();
        System.out.println("preorder : ");
        preorder(root);
        System.out.println();
        System.out.println("postorder : ");
        postorder(root);
        System.out.println();
    }

    //LRN
    private static void postorder(Node root) {
    }

    //NLR
    private static void preorder(Node root) {
    }

    //LNR
    private static void inorder(Node root) {
    }

    private static Node buildTree() {
        Scanner scanner = new Scanner(System.in);

        Node root = null;

        System.out.println("Enter data : ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("0")) {
            return null;
        }

        root = new Node(input);

        System.out.println("create node in the left of " + root.data);
        root.left = buildTree();

        System.out.println("create node in the right of " + root.data);
        root.right = buildTree();

        return root;
    }
}

class Node {
    String data;
    Node left;
    Node right;

    Node(String input) {
        data = input;
    }
}
