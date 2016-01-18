package TreeSet;

import ClassWork.Node;

import java.util.Iterator;

public class BinarySearchTree<T> implements ITree<T> {
    private Node<T> root;
    private int size;


    @Override
    public boolean add(T t) {
        if(!(t instanceof Comparable)) throw new NotComparableException();
        if (root == null)
            root = new Node<>(t);
        Comparable insertion = (Comparable) t;
        else if ()



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

    public class Node<E> {
         E value;
         Node<E> parent;
         Node<E> leftChild ;
         Node<E> rightChild;

        public Node(){

        }

        public Node(E value) {
            this.value = value;
        }

    }
}
