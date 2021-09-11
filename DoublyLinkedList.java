public class DoublyLinkedList {
    private Node head;
    private int size;
    private Node rear;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void Enqueue(Object data) { 
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.rear = this.head;
        }
        else {
            this.rear.next = newNode;
            newNode.last = this.rear;
            this.rear = newNode;
            
        }
        this.size = this.size + 1;
    }

    public Node Dequeue() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
    
    public Node Peak() {
        return this.head;
    }

    public void print() {
        Node temp = this.head;
        while (temp != null){
            System.out.println((int) temp.getData());
            temp = temp.next;
        }
    }
}