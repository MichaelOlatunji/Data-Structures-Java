package BinarySearchTree;

public class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public BSTNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public BSTNode(int data, BSTNode left, BSTNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData(){
        return this.data;
    }

    public BSTNode getLeft(){
        return this.left;
    }

    public BSTNode getRight(){
        return this.right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(BSTNode BSTNode){
        this.left = BSTNode;
    }

    public void setRight(BSTNode BSTNode){
        this.right = BSTNode;
    }

    public static BSTNode tree(int data, BSTNode left, BSTNode right){
        return new BSTNode(data, left, right);
    }

    public static BSTNode treeLeft(int data, BSTNode left){
        return new BSTNode(data, left, null);
    }

    public static BSTNode treeRight(int data, BSTNode right){
        return new BSTNode(data, null, right);
    }

    public static BSTNode leaf(int data){
        return new BSTNode(data, null, null);
    }
}

