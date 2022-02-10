package bst_practice;

import java.util.Scanner;

public class BSTRunner {

    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();

        bs.insert(12);
        bs.insert(30);
        bs.insert(10);
        bs.insert(76);
        bs.insert(40);
        bs.insert(7);

        System.out.println("--------------");
        bs.printTree();
    }
}

class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        root = null;

    }

    public void printTree() {
        inorder(root);
    }

    private void inorder(Node root) {
        //LNR
        if (root == null) {
            return;
        }

        inorder(root.low);
        System.out.print(root.data + "-->");
        inorder(root.high);
    }

    public void insert(int input) {
        Node node = new Node(input);
        if (root == null) {
            root = node;
            System.out.println(input + " added");
            return;
        }

        if (input > root.data) {
            if (root.high == null) {
                root.high = node;
                System.out.println(input + " added");
            } else {
                insertAt(node, root.high);
            }
        } else {
            if (root.low == null) {
                root.low = node;
                System.out.println(input + " added");
            } else {
                insertAt(node, root.low);
            }
        }
    }

    private void insertAt(Node node, Node root) {
        if (node.data > root.data) {
            if (root.high == null) {
                root.high = node;
                System.out.println(node.data + " added");
            } else {
                insertAt(node, root.high);
            }
        } else {
            if (root.low == null) {
                root.low = node;
                System.out.println(node.data + " added");
            } else {
                insertAt(node, root.low);
            }
        }
    }

    public void removeNode(int input) {
        root = remove(root, input);
    }

    private Node remove(Node currentNode, int data) {
        if (currentNode == null) {
            return null;
        }
        if (data < currentNode.data) {
            currentNode.low = remove(currentNode.low, data);
        } else if (data > currentNode.data) {
            currentNode.high = remove(currentNode.high, data);
        } else {
            if (currentNode.low != null && currentNode.high != null) {
                //min of R
                int minR = min(currentNode.high);
                currentNode.data = minR;
                currentNode.high = remove(currentNode.high, minR);
                
            } else if (currentNode.low != null) {
                return currentNode.low;
            } else if (currentNode.high != null) {
                return currentNode.high;
            } else {
                return null;
            }
        }
        return currentNode;
    }

    private int min(Node root) {
        if (root.low != null) {
            return min(root.low);
        }
        return root.data;
    }

}

class Node {
    int data;
    Node low;
    Node high;

    Node(int input) {
        data = input;
    }
}
