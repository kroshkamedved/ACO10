package TreeSet;

import ClassWork.Node;

import java.util.EmptyStackException;
import java.util.Iterator;

public class BinarySearchTree<T> implements ITree<T> {
    private Node<T> root;
    private int size;


    @Override
    public boolean add(T t) {
        if (!(t instanceof Comparable)) throw new NotComparableException();
        Node<T> iterator = root;
        if (iterator == null) {
            root = new Node<>(t);
            return true;
        }
        Comparable insertion = (Comparable) t;
        Node<T> parent = new Node<>();
        if (insertion.compareTo(iterator.value) == 0) throw new DuplicateValueExcerption();
        if (insertion.compareTo(iterator.value) < 0) {
            if (iterator.leftChild == null) {
                iterator.leftChild = new Node<>(t);
                iterator.leftChild.parent = iterator;
                return true;
            }
        } else {
            iterator.rightChild = new Node<>(t);
            iterator.rightChild.parent = iterator;
            return true;
        }
        while (iterator != null) {
            if (insertion.compareTo(iterator.value) < 0) {
                parent = iterator;
                iterator = iterator.leftChild;
                if (iterator == null) break;
            }
            if (insertion.compareTo(iterator.value) > 0) {
                parent = iterator;
                iterator = iterator.rightChild;
                if (iterator == null) break;
            }
            if (insertion.compareTo(iterator.value) == 0) throw new DuplicateValueExcerption();
        }

        if (insertion.compareTo(parent.value) > 0) {
            parent.rightChild = new Node<>(t);
            parent.rightChild.parent = parent;
        } else {
            parent.leftChild = new Node<>(t);
            parent.leftChild.parent = parent;
        }
        return true;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public T findMax() {
        return null;
    }

    @Override
    public void clear() {

    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    void findPosition() {

    }

    public class Node<E> {
        E value;
        Node<E> parent;
        Node<E> leftChild;
        Node<E> rightChild;

        public Node() {

        }

        public Node(E value) {
            this.value = value;
        }

    }
}
