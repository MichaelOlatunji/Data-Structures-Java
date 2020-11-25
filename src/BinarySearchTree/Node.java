package BinarySearchTree;

public class Node {
    int data;
    Node left, right;

    public Node(){
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData(){
        return this.data;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(Node node){
        this.left = node;
    }

    public void setRight(Node node){
        this.right = node;
    }

    public static Node tree(int data, Node left, Node right){
        return new Node(data, left, right);
    }

    public static Node treeLeft(int data, Node left){
        return new Node(data, left, null);
    }

    public static Node treeRight(int data, Node right){
        return new Node(data, null, right);
    }

    public static Node leaf(int data){
        return new Node(data, null, null);
    }
}

