package AVLTree;

public class AVLTreeNode {
    int data, balance;
    AVLTreeNode left, right, parent;

    public AVLTreeNode(){
        this.data = 0;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.balance = 0;
    }

    public AVLTreeNode(int data){
        this.data = data
    }

    public AVLTreeNode(int data, AVLTreeNode left, AVLTreeNode right, AVLTreeNode parent, int balance){
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.balance = balance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AVLTreeNode getLeft() {
        return left;
    }

    public void setLeft(AVLTreeNode left) {
        this.left = left;
    }

    public AVLTreeNode getRight() {
        return right;
    }

    public void setRight(AVLTreeNode right) {
        this.right = right;
    }

    public AVLTreeNode getParent() {
        return parent;
    }

    public void setParent(AVLTreeNode parent) {
        this.parent = parent;
    }
}
