package ru.otus.achaychenko.colls;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {
    @Override
    public int compare(T c1, T c2) {
        return (int) c2 - (int) c1;
    }

}
