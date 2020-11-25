package SinglyLinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public SinglyLinkedList(){
        this.head = this.tail = null;
        this.size = 0;
    }

    public SinglyLinkedList(int data){
        this.head = this.tail = new Node(data);
        this.size = 1;
    }

    public SinglyLinkedList(Node node){
        this.head = this.tail = node;
        this.size = 1;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
        return;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null) addFirst(data);
        this.tail.next = node;
        this.tail = node;
        this.size++;
        return;
    }

    public void removeFirst(){
        Node tmp = this.head;
        if(this.head != null){
            if(this.head == this.tail){
                this.head = this.tail = null;
            } else {
                this.head = tmp.next;
            }
            this.size--;
            System.out.println(tmp.data);
            return;
        }
        System.out.println("Empty list");
    }

    public void removeLast(){
        if(this.head != null) {
            if (this.head == this.tail) removeFirst();
            else {
                Node current = this.head, prev = null;
                while (current.next != null) {
                    prev = current;
                    current = current.next;
                }
                prev.next = null;
                this.tail = prev;
                this.size--;
                return;
            }
        }
        System.out.println("Empty list");
    }

    public void remove(int data){
        if(this.head != null) {
            Node current = this.head, prev = null;
            while(current != null){
//                if(((Comparable<Integer>) data).compareTo(current.data) == 0){
                if(current.data == data){
                    if(current == this.head){
                        removeFirst();
                        return;
                    }
                    if(current == this.tail) {
                        removeLast();
                        return;
                    }
                    prev.next = current.next;
                    this.size--;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
        System.out.println("Empty list");
        return;
    }

    public boolean contains(int data){
        if(this.head != null) {
            Node current = this.head, prev = null;
            while(current != null){
                if(current.data == data){
                    return  true;
                }
                prev = current;
                current = current.next;
            }
        }
        return false;
    }

    public void removeAtPosition(int pos){
        if(this.head != null){
            if(pos >= size){
                System.out.println("Position does not exist");
                return;
            }
            if(pos == 0) {
                removeFirst();
                return;
            }
            if(pos == this.size - 1) {
                removeLast();
                return;
            }
            Node current = this.head, prev = null;
            for(int i = 0; i < this.size; i++){
                if(i == pos){
                    prev.next = current.next;
                    this.size--;
                    break;
                }
                prev = current;
                current = current.next;
            }
            System.out.println(current.data);
            return;
        }
        System.out.println("Empty list");
        return;
    }

    public void insertAtPosition(int pos, int data){
        Node node = new Node(data);
        if(pos > size){
            System.out.println("Position does not exist");
            return;
        }
        if(pos == 0){
            addFirst(data);
            return;
        }
        if(pos == this.size) {
            addLast(data);
            return;
        }
        pos -= 1;
        Node current = this.head, prev = null;
        for(int i = 0; i < this.size; i++){
            if(pos == i){
                prev.next = node;
                node.next = current;
                this.size++;
                break;
            }
            prev = current;
            current = current.next;
        }
        return;

    }

    public void replaceAtPosition(int pos, int data){
        if(this.head != null){
            if(pos >= size){
                System.out.println("Position does not exist");
                return;
            }
            if(pos == size - 1){
                this.tail.data = data;
                return;
            }
            Node current = this.head;
            for(int i = 0; i < this.size; i++){
                if(pos == i){
                    current.data = data;
                    break;
                }
                current = current.next;
            }
            return;
        }
        System.out.println("Empty List");
    }

    public void display(){
        if(this.head != null){
            if(this.head == this.tail){
                System.out.println(this.head.data);
                return;
            }
            Node current = this.head;
            while(current != null){
                if(current == tail){
                    System.out.print(current.data +"\n");
                }else{
                    System.out.print(current.data +"->");
                }
                current = current.next;
            }
            return;
        }
        System.out.println("Empty List");
    }

    public int get(int pos){
        if(this.head != null){
            if(pos >= size){
                System.out.println("Position does not exist in list");
                return -1;
            }
            if(pos == size - 1){
                return tail.data;
            }
            Node current = this.head;
            for(int i = 0; i < this.size; i++){
                if(pos == i){
                    return current.data;
                }
                current = current.next;
            }
        }
        System.out.println("Empty List");
        return -1;
    }

    public int find(int data){
        if(this.head != null){
            if(tail.data == data){
                return size-1;
            }
            Node current = this.head;
            int pos = 0;
            while(current != null){
                if(current.data == data){
                    return pos;
                }
                current = current.next;
                pos++;
            }
        }
        return -1;
    }

    public void reverse(){
        Node current = this.head, prev = null, next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.tail = this.head;
        this.head = prev;
        return;
    }

    public int countNumberOfReccurrence(int data){
        int counter = 0;
        Node current = this.head;
        while(current != null){
            if(current.data == data){
                counter++;
            }
            current = current.next;
        }
        return counter;
    }

}
