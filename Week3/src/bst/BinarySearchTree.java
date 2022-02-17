package bst;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int input) {
        Node node = new Node(input);

        //if the tree is empty
        if (root == null) {
            root = node;
            System.out.println(input + " added to the tree.");
            return;
        }

        if (input > root.data) {
            //input in the higher sub tree
            if (root.high == null) {
                root.high = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.high);
            }
        } else {
            //input in the lower subtree
            if (root.low == null) {
                root.low = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.low);
            }
        }
    }

    private void insertAt(Node node, Node root) {
        if (node.data > root.data) {
            //input in the higher subtree
            if (root.high == null) {
                root.high = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.high);
            }
        } else {
            //input in the lower sub tree
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

    public void removeNode(int input) {
        root = remove(root, input);
    }

    private Node remove(Node root, int data) {
        if(root == null) {
            return null;
        }
        if(data < root.data) {
            root.low = remove(root.low, data);
        } else if(data > root.data) {
            root.high = remove(root.high, data);
        } else {
            if(root.low != null && root.high != null) {
                //max of L
//                int lMax = max(root.low);
//                root.data = lMax;
//                root.low = remove(root.low, lMax);

                //min of R
                int rMin = min(root.high);
                root.data = rMin;
                root.high = remove(root.high, rMin);

            } else if (root.low != null) {
                return root.low;
            } else if (root.high != null) {
                return root.high;
            } else {
                return null;
            }
        }

        return root;
    }

    private int min(Node root) {
        if(root.low != null) {
            return min(root.low);
        }
        return root.data;
    }

    private int max(Node root) {
        if(root.high != null) {
            return max(root.high);
        }
        return root.data;
    }

    public void printTree() {
        inorder(root);
    }

    private void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.low);
        System.out.println(root.data);
        inorder(root.high);
    }

    public Node floor(int key) {
        Node node = this.root;
        Node answerNode = null;
        while(node != null) {
            if(node.data == key) {
                return node;
            }

            if(node.data > key) {
                node = node.low;
            } else {
                answerNode = node;
                node = node.high;
            }
        }

        return answerNode;
    }

    public Node ceil(int key) {
        Node node = this.root;
        Node answerNode = null;
        while(node != null) {
            if(node.data == key) {
                return node;
            }

            if(node.data < key) {
                node = node.high;
            } else {
                answerNode = node;
                node = node.low;
            }
        }

        return answerNode;
    }
}
