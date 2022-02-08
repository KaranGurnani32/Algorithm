package bst;

public class BSTRunner {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);
        bst.insert(-4);
        bst.insert(45);

        if(bst.search(5)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(45)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(25)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }
        if(bst.search(95)) {
            System.out.println("it is in the tree!");
        } else {
            System.out.println("not in the tree!");
        }

        System.out.println("=================");
        bst.printTree();
        System.out.println("=================");

        System.out.println("Removing 20");
        bst.removeNode(20);


        System.out.println("=================");
        bst.printTree();
        System.out.println("=================");


    }
}
