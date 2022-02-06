package bst;

public class Node {
    public int data;
    public Node low;
    public Node high;

    public Node(int inputData) {
        this.data = inputData;
        low = null;
        high = null;
    }
}
