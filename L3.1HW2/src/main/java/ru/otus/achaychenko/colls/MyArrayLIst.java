package ru.otus.achaychenko.colls;

import java.util.*;

class MyArrayList<T> extends MyComparator<T> implements List<T>, Iterator<T> {
    private Object[] arr;
    private int size;
    private int pos = 0;

    MyArrayList(int sze){
        if(sze > 0){
            size = sze;
        }else {
            size = 0;
        }

        arr = new Object[10];

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
    public Iterator<T> iterator() {
        Object[] copy = Arrays.copyOf(arr, size);
        return (Iterator<T>) Arrays.asList(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(arr, size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size >= arr.length) {
            // make a bigger array and copy over the elements
            @SuppressWarnings("unchecked")
            T[] bigger = (T[]) new Object[arr.length * 2];
            System.arraycopy(arr, 0, bigger, 0, arr.length);
            arr = bigger;
        }
        arr[size] = t;
        size++;
        return true;
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
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    @Override
    public T set(int index, T element) {
        T old = get(index);
        arr[index] = element;
        return old;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // add the element to get the resizing
        add(element);

        // shift the elements
        for (int i=size-1; i>index; i--) {
            arr[i] = arr[i-1];
        }
        // put the new one in the right place
        arr[index] = element;
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

    @Override
    public int compare(T o1, T o2) {
        return (int)o1 - (int)o2;
    }

    @Override
    public boolean hasNext() {
        return pos < arr.length;
    }

    @Override
    public T next() {
        return (T) arr[pos++];
    }
}
