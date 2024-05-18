package binarytree;
/*
 * Source: http://cslibrary.stanford.edu/110/BinaryTrees.html
 * 
 * This is article #110 in the Stanford CS Education Library. This and other free CS materials are available at the library (http://cslibrary.stanford.edu/). That people seeking education should have the opportunity to find it. This article may be used, reproduced, excerpted, or sold so long as this paragraph is clearly reproduced. Copyright 2000-2001, Nick Parlante, nick.parlante@cs.stanford.edu. 
 */
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

    private int maxDepth(Node node) {
        if(node == null) return 0;
        else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            return (Math.max(leftDepth, rightDepth)+1);
        }
    }

    public int maxDepth() {
        return maxDepth(root);
    }

    private int minValue(Node node) {
        if (node.left==null) {
            return node.data;
        }else {
            return minValue(node.left);
        }
    }

    public int minValue() {
        return minValue(root);
    }

    private int maxValue(Node node) {
        if (node.right==null) {
            return node.data;
        }else {
            return maxValue(node.right);
        }
    }

    public int maxValue() {
        return maxValue(root);
    }

    private void printTree(Node node) {
        if (node == null) return;

        printTree(node.left);
        System.out.println(node.data);
        printTree(node.right);
    }

    public void printTree() {
        printTree(root);
    }

    private void printPostorder(Node node) {
        if (node == null) return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.data);
    }

    public void printPostorder() {
        printPostorder(root);
    }

    private boolean hasPathSum(Node node, int sum) {
        if (node == null) {
            return sum == 0;
        }else {
            int subSum = sum - node.data;
            return (hasPathSum(node.left, subSum) || hasPathSum(node.right, subSum));
        }
    }
    public boolean hasPathSum(int sum) {
        return hasPathSum(root, sum);
    }

    public void printPaths() {
        int[] path = new int[1000];
        printPaths(root, path, 0);
    }

    private void printPaths(Node node, int[] path, int pathLen) {
        if(node == null) return;

        path[pathLen] = node.data;
        pathLen++;

        if(node.left == null && node.right == null) printArray(path, pathLen);
        else {
            printPaths(node.left, path, pathLen);
            printPaths(node.right, path, pathLen);
        }
    }

    private void printArray(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    private void mirror(Node node) {
        if(node!=null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;

            mirror(node.left);
            mirror(node.right);
        }
    }

    public void mirror() {
        mirror(root);   
    }


    private void doubleTree(Node node) {
        if(node == null) return;

        doubleTree(node.left);
        doubleTree(node.right);

        Node temp = node.left;
        node.left = new Node(node.data);
        node.left.left = temp;
    }

    public void doubleTree() {
        doubleTree(root);
    }

    private boolean sameTree(Node a, Node b) {
        if(a==null && b==null) return true;
        else if(a!=null && b!=null) {
            return(
                a.data == b.data &&
                sameTree(a.left, b.left) && 
                sameTree(a.right, b.right)
            );
        }else return false;
    }

    public boolean sameTree(BinaryTree secondTree) {
        return( sameTree(root, secondTree.root));
    }

    public static int countTrees(int numKeys) {
        if (numKeys<=1) {
            return 1;
        }else {
            int sum = 0;
            int left;
            int right;
            int root;

            for(root = 1;root<=numKeys;root++) {
                left = countTrees(root-1);
                right = countTrees(numKeys - root);

                sum += (left*right);
            }
            return sum;
        }
    }

    private boolean isBST(Node node) {
        if(node == null) return true;

        if(node.left!=null && maxValue(node.left)>node.data) return false;
        if(node.right!=null && minValue(node.right)<=node.data) return false;

        return ( isBST(node.left) && isBST(node.right) );
    }

    public boolean isBST() {
        return isBST(root);
    }

    private boolean isBST2(Node node, int min, int max) {
        if(node == null) return true;
        else {
            boolean leftOk = isBST2(node.left, min, node.data);
            
            if(!leftOk) return false;

            return isBST2(node.right, node.data+1, max);
        }
    }

    public boolean isBST2() {
        return isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
