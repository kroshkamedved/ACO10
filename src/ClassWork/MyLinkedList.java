package ClassWork;

import java.util.Iterator;
import java.util.List;

/**
 * Created by gavri on 27.12.2015.
 */
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public int size() {
        return this.size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Node iterator = head;
        while (iterator != null) {
            if (iterator.getValue().equals(o)) return true;
            iterator = iterator.getNext();
        }
        return false;
    }

  /*  public Iterator iterator() {
        return null;
    } */

    public boolean add(Object o) {
        if (size == 0) {
            head = new Node(o);
            tail = head;
        } else {
            Node next = new Node(o);
            tail.setNext(next);
            tail = tail.getNext();

        }

        size++;
        return true;
    }

    public boolean remove(Object o) {
        Node iterator = head;
        while (iterator != null) {
            if (iterator.getNext().getValue().equals(o)) {
                iterator.setNext(iterator.getNext().getNext());
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;

    }

    public boolean clear(){
        head = tail =null;
        size = 0;
        return true;
    }


}
