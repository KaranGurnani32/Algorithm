package bst_practice;

public class BSTRunner {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);

        if(bst.search(5)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
    }
}

class BinarySearchTree {

    private Node root;

    // () -> represent Node

    BinarySearchTree(){
        // (Root) = (null)
        root = null;
    }

    public void insert(int input){
        // (node) in which there will be some data i.e input
        //assume input is 4
        Node node = new Node(input);

        //tree is empty
        // if (root) = (null)
        if (root == null) {
            //(root) = (4)
            root = node;
            return;
        }

        //tree not empty
        //(root) = (4)
        //input is 6, 6 > 4
        if (input > root.data) {
            if (root.high == null) {
                // (4) -> (6)
                root.high = node;
                System.out.println(input + " added to the tree.");
            } else {
                // it is already (4) -> (6) then
                insertAt(node, root.high);
            }
        } else {
            if (root.low == null){
                //4 in right of it is 6, in left is 2
                root.low = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.low);
            }
        }

    }

    private void insertAt(Node node, Node root) {
        // (4) -> (6), We take 6 as root node
        // in tree (6) is there
        // node.data is 8
        if (node.data > root.data) {
            if (root.high == null) {
                // (6) -> (8)
                root.high = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                // assume (6) -> (8)
                insertAt(node, root.high);
            }
        } else {
            if (root.low == null) {
                root.low = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.low);
            }
        }
    }

    public boolean search(int input) {
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.high);
            } else {
                return searchAt(input, root.low);
            }
        }
    }

    private boolean searchAt(int input, Node root) {
        if(root == null) {
            return false;
        }
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.high);
            } else {
                return searchAt(input, root.low);
            }
        }
    }
}

class Node {
    int data;
    Node low;
    Node high;

    Node(int inputData) {
        data = inputData;
        low = null;
        high = null;
    }
}
