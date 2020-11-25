package singlylinkedlist;

public class Node {
    Node next;
    int data;

    public Node(){
        this.next = null;
        this.data = 0;
    }

    public Node(int data){
        this.next = null;
        this.data = data;
    }

    public Node(int data, Node next){
        this.next = next;
        this.data = data;
    }

    public int getData(){ return this.data; }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
