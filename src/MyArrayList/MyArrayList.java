package MyArrayList;

import java.lang.reflect.Array;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private E[] elementData;

    private int size;

    public MyArrayList(int capacity) {
        if (capacity <= 0) throw new minLengthExcerption("Length should be 1 or longer");
        elementData = (E[]) new Object[capacity];

    }

    public MyArrayList() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean add(E element) {
        if (size == elementData.length)
            resizeAl();
        elementData[size] = element;
        size++;

        return true;
    }

    private void resizeAl() {
        E[] newArray = (E[]) new Object[((elementData.length * 3) / 2 + 1)];
        System.arraycopy(elementData, 0, newArray, 0, size);
        elementData = newArray;
    }

    public int size() {
        return this.size;
    }

    public E get(int index) {
        //todo check index and throw exception; 
        return elementData[index];
    }

}
