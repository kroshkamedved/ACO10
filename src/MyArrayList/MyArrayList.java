package MyArrayList;

import java.lang.reflect.Array;


/* Write your own ArrayList!
        First look the structure and methods of Java ArrayList!!!

        implement different constructors

        implement methods:

        * add(Object)
        * add(index, Object)
        * get(index)
        * remove(index)
        * remove(Object)
        * set(index, Object)
        * clear()
        * contains(Object)
        * size()      */

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

    public boolean add(int index, E element) {
        if (index < 0 || index > size) throw new indexOutOfBoundsExceptionMy("Index out of bounds");
        if (index == size) return this.add(element);
        if (size == this.elementData.length) resizeAl();
        E[] newArray = (E[]) new Object[elementData.length];
        System.arraycopy(elementData, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(elementData, index, newArray, (index + 1), (size - index));
        elementData = newArray;
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
        if (index < 0 || index >= size) throw new indexOutOfBoundsExceptionMy("Index out of bounds");
        return elementData[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) throw new indexOutOfBoundsExceptionMy("Index out of bounds");
        E result = elementData[index];
        elementData[index] = element;
        return result;
    }

    public void clear() {
        if (size == 0) return;
        E[] newArray = (E[]) new Object[elementData.length];
        elementData = newArray;
        size = 0;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) throw new indexOutOfBoundsExceptionMy("Index out of bounds");
        E result = elementData[index];
        E[] newArray = (E[]) new Object[elementData.length];
        System.arraycopy(elementData, 0, newArray, 0, index);
        System.arraycopy(elementData, index + 1, newArray, index, size - index - 1);
        elementData = newArray;
        return result;
    }

    public boolean remove(Object element) {
        // if (element.getClass() != this.getClass()) return false;
        if (element == null) return false;
        for (int i = 0; i <= size; i++) {
            if (element.equals(elementData[i])) remove(i);
            return true;
        }
        return false;
    }

    public boolean contains(Object element) {
        if (element == null) return false;
        for (int i = 0; i <= size; i++) {
            if (element.equals(elementData[i])) return true;
        }
        return false;
    }
}
