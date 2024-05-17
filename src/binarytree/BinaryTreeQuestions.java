package binarytree;

public class BinaryTreeQuestions extends BinaryTree{
    
    public BinaryTreeQuestions() {
        super();
    }

    public void build123a() {
        root = new Node(2);
        Node lchild = new Node(1);
        Node rchild = new Node(3);
        
        root.left = lchild;
        root.right = rchild;
    }

    public void build123b() {
        root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
    }

    public void build123c() {
        root = null;
        insert(2);
        insert(1);
        insert(3);
    }

    private int size(Node node) {
        if(node==null) return 0;
        else return 1 + size(node.left) + size(node.right);
    }

    public int size() {
        return size(root);
    }


}
