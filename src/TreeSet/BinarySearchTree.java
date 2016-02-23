package TreeSet;

import java.util.Iterator;
import java.util.Iterator;

/*
public class BinarySearchTree<T extends Comparable> implements ITree<T> {
    private Node<T> root;
    private int size;


    @Override
    public boolean add(T t) {
        if (!(t instanceof Comparable)) throw new NotComparableException();
        Node<T> iterator = root;
        if (iterator == null) {
            root = new Node<>(t);
            ++size;
            return true;
        }
        Comparable insertion = (Comparable) t;
        Node<T> parent = new Node<>();
        if (insertion.compareTo(iterator.value) == 0) throw new DuplicateValueExcerption();
        if (insertion.compareTo(iterator.value) < 0) {
            if (iterator.leftChild == null) {
                iterator.leftChild = new Node<>(t);
                iterator.leftChild.parent = iterator;
                ++size;
                return true;
            }
        } else {
            iterator.rightChild = new Node<>(t);
            iterator.rightChild.parent = iterator;
            ++size;
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
        ++size;
        return true;
    }


    public Node<T> binarySearch(T t){
        Node<T> iter = root;
        while (iter != null){
             int compare = t.compareTo(iter.value);
            if (compare < 0){
                iter = iter.leftChild;
            } else if (compare > 0) {
               iter = iter.rightChild;
            } else {
                break;
            }
        }
        return  iter;
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
        if(root==null) return null;
        Node<T> iter = root;
        while (iter.leftChild!=null) iter = iter.leftChild;
        return iter.value;
    }

    @Override
    public T findMax() {
        if(root==null) return null;
        Node<T> iter = root;
        while (iter.rightChild!=null) iter = iter.rightChild;
        return iter.value;
    }

    @Override
    public void clear() {
        size  = 0;
        root = null;

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
*/

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {
    private Node<T> root;
    private int size;

    @Override
    public boolean add(T obj) {
        if(root == null) {
            root = new Node<>(obj);
            size++;
            return true;
        }
        Node<T> iter = root;
        while(true){
            int compare = obj.compareTo(iter.value);
            if(compare < 0){
                if(iter.leftChild == null){
                    iter.leftChild = new Node<>(obj, iter);
                    size++;
                    return true;
                } else{
                    iter = iter.leftChild;
                }
            }else if(compare > 0){
                if(iter.rightChild == null){
                    iter.rightChild = new Node<>(obj, iter);
                    size++;
                    return true;
                } else{
                    iter = iter.rightChild;
                }
            } else{
                return false;
            }
        }
    }

    @Override
    public boolean remove(T t) {
        Node<T> delete = binarySearch(t);
        if(delete.leftChild == null && delete.rightChild == null){
            if(delete == root){
                root = null;
            } else if(delete == delete.parent.leftChild){
                delete.parent.leftChild = null;
            } else {
                delete.parent.rightChild = null;
            }
            size--;
            return true;
        } else if(delete.leftChild == null || delete.rightChild == null){
            Node<T> child = delete.leftChild == null ? delete.rightChild : delete.leftChild;
            child.parent = delete.parent;
            if(delete == root){
                root = child;
            } else if (delete == delete.parent.leftChild){
                delete.parent.leftChild = child;
            } else {
                delete.parent.rightChild = child;
            }
            size--;
            return true;

        } else{
            Node<T> iter = delete.rightChild;
            while (iter.leftChild != null){
                iter = iter.leftChild;
            }
            if(iter.rightChild!= null){
                iter.rightChild.parent = iter.parent;
                iter.parent.leftChild = iter.rightChild;
            }
            delete.rightChild.parent = iter;
            delete.leftChild.parent = iter;
            delete.parent.rightChild = iter;
            iter = null;
            size--;
            return true;
        }
    }

    @Override
    public boolean contains(T t) {

        Node<T> search = binarySearch(t);
        return search != null;
    }

    private Node<T> binarySearch(T obj) {
        Node<T> iter = root;
        while(iter != null){
            int compare = obj.compareTo(iter.value);
            if(compare < 0) {
                iter = iter.leftChild;
            }else if(compare > 0){
                iter = iter.rightChild;
            } else{
                break;
            }
        }
        return iter;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public T findMin() {
        if(root == null){
            return null;
        }
        Node<T> iter = root;
        while (iter.leftChild != null){
            iter = iter.leftChild;
        }
        return iter.value;
    }

    @Override
    public T findMax() {
        if(root == null){
            return null;
        }
        Node<T> iter = root;
        while (iter.rightChild != null){
            iter = iter.rightChild;
        }
        return iter.value;

    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }



    private class Node<E> {
        private E value;
        Node<E> parent;
        Node<E> leftChild ;
        Node<E> rightChild;


        public Node(E value, Node<E> parent) {
            this.value = value;
            this.parent = parent;
        }

        public Node(E value) {
            this.value = value;
        }


    }
}