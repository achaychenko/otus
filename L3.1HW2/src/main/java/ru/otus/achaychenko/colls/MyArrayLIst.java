package ru.otus.achaychenko.colls;

import java.util.*;

class MyArrayList<T> implements List<T>, Comparable<T>, Iterable<T>{

    private Object elements[];
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int index;
    private int pos = 0;

    public MyArrayList(){

        elements = new Object[DEFAULT_CAPACITY];
        this.size = DEFAULT_CAPACITY;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public void add(int index, T element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        // add the element to get the resizing
        add(element);

        // shift the elements
        for (int i=this.size-1; i>index; i--) {
            elements[i] = elements[i-1];
        }
        // put the new one in the right place
        elements[index] = element;
    }

    @Override
    public boolean add(T t) {
        if (this.index == this.size -1) {
            increaseSizeAndReallocate();
            return true;
        }
        elements[this.index] = t;
        this.index++;
        return true;
    }

    private void increaseSizeAndReallocate() {
        this.size += DEFAULT_CAPACITY;
        Object newElements[] = new Object[this.size];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean flag = true;
        for (T element: c) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Object[] currentData = elements;
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < currentData.length;
            }

            @Override
            public T next() {
                return (T) elements[pos++];
            }

            @Override
            public void remove() {
                MyArrayList.this.remove(pos++);
            }
        };
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    @Override
    public T set(int index, T element) {
        T old = get(index);
        elements[index] = element;
        return old;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}