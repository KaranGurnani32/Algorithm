package binarytree_example_practice;

import java.util.Scanner;

public class BinaryTree {
    //scanner is static because main method is static
    // static method cannot call non-static variable or non-static method directly
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        createTree();
    }

    static Node createTree() {

        System.out.println("Enter data : ");
        int data = sc.nextInt();

        if (data == -1){
            return null;
        }

        //object is created
        //it is not necessary to create object in main method
        //it is not necessary to create object in same class
        Node root = new Node(data);

        System.out.println("Enter left : " + data);
        root.left = createTree();

        System.out.println("Enter right : " + data);
        root.right = createTree();

        return root;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
