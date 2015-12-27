package ClassWork;

public class Node {
    private Node next;
    private Object value;

    public Node() {
    }

    public Node(Node next, Object value) {
        this.next = next;
        this.value = value;
    }

    public Node(Node next) {
        this.next = next;
    }

    public Node(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
