package BinarySearchTree;

public class BinarySearchTree {
    BSTNode root;
    int size;

    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(BSTNode root){ this.root = root; }

    private void add(int data, BSTNode node){
        if(((Comparable <Integer>) data).compareTo(node.data) >= 0){
            if(node.right == null){
                node.right = new BSTNode(data);
                return;
            }
            add(data, node.right);
            return;
        }
        if(node.left == null){
            node.left = new BSTNode(data);
            return;
        }
        add(data, node.left);
    }

    public void add(int data){
        if(this.root == null){
            this.root = new BSTNode(data);
        } else {
            this.add(data, this.root);
        }
        this.size++;
    }

    private boolean contains(int data, BSTNode node){
        if(((Comparable <Integer>) data).compareTo(node.data) == 0){
            return true;
        }

        if(((Comparable <Integer>) data).compareTo(node.data) > 0){
            return contains(data, node.right);
        }
        return contains(data, node.left);
    }

    public boolean contains(int data){
        if(this.root == null){
            return false;
        }
        return this.contains(data, this.root);
    }

    private BSTNode remove(BSTNode node, int data){
        // if data is less than node search left
        if(data < node.data){
            node.left = remove(node.left, data);
        }
        // if data is greater than node search right
        else if(data > node.data){
            node.right = remove(node.right, data);
        }
        else{
            // has no child
            if(node.left == null && node.right == null){
                node = null;
            }
            // has only right child
            else if(node.left == null){
                node = node.right;
            }
            // has only left child
            else if(node.right == null){
                node = node.left;
            }
            // has two child
            else{
                BSTNode tmp = this.findMinimum(node.right);
                node.data = tmp.data;
                // delete duplication
                node.right = remove(node.right, tmp.data);
            }
        }
        return node;
    }

    public BSTNode remove(int data){
        if(this.root == null){
            return null;
        }
        return this.remove(this.root, data);
    }

    // finds successor (least element in right of the root)
    public BSTNode findMinimum(BSTNode node){
        if(node.left != null){
            return findMinimum(node.left);
        }
        return node;
    }

    // finds predecessor (highest element in left of the root)
    public BSTNode findMaximum(BSTNode node){
        if(node.right != null){
            return findMaximum(node.right);
        }
        return node;
    }

    /*
    1. if right subtree is not null, successor will be the leftmost
       child of the right subtree or the right child itself

    2. If key is smaller than root node:
        a) Set the successor as root
        b) search recursively into the left subtree
    */

    public BSTNode findSuccessor(BSTNode root, BSTNode succ, int key){
        if(root == null){
            return null;
        }

        if(key == root.data){
            if(root.right != null) {
                return findMinimum(root.right);
            }
        }
        else if(key < root.data){
            succ = root;
            return findSuccessor(root.left, succ, key);
        }
        else{
            return findSuccessor(root.right, succ, key);
        }

        return succ;
    }


    /*
    1. If the left subtree is not null, the rightmost child of the
       left subtree is the predecessor or the left child itself

    2. If key is greater than the root node:
        a) set the predecessor as root
        b) search recursively to the right subtree
    */

    public BSTNode findPredecessor(BSTNode root, BSTNode pred, int key){
        if(root == null){
            return null;
        }
        if(key == root.data){
            if(root.left != null){
                return findMaximum(root.left);
            }
        }
        else if(key > root.data){
            pred = root;
            return findPredecessor(root.right, pred, key);
        }
        else {
            return findPredecessor(root.left, pred, key);
        }

        return pred;
    }

    public BSTNode leftRotate(BSTNode node){
        BSTNode tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        return tmp;
    }

    public  BSTNode rightRotate(BSTNode node){
        BSTNode tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        return  tmp;
    }

    public BSTNode rightLeftRotate(BSTNode node){
        node.right = this.rightRotate(node.right);
        return this.leftRotate(node);
    }

    public BSTNode leftRightRotate(BSTNode node){
        node.left = this.leftRotate(node.left);
        return this.rightRotate(node);
    }
}
