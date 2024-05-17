package binarytree;

public class BinaryTree{
    public Node root;

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int val) {
            left = null;
            right = null;
            data = val;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public boolean lookUp(int data) {
        return lookUp(root, data);
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private boolean lookUp(Node node, int data) {
        if(node==null) return false;

        if(data==node.data) {
            return true;
        }else if(data<node.data) {
            return lookUp(node.left, data);
        }else {
            return lookUp(node.right, data);
        }
    }

    private Node insert(Node node, int data) {
        if(node==null) {
            return new Node(data);
        }else {
            if(data <=node.data) {
                node.left = insert(node.left, data);
            }else {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }

}