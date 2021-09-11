public class Node {
    public Object data;
    public Node next;
    public Node last;

    public Node(Object data) {
        this.next = null;
        this.data = data;
        this.last = null;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getLast() {
        return this.last;
    }

    public void setLast(Node node) {
        this.last = node;
    }
}