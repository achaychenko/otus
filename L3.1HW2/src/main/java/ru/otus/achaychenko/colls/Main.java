package ru.otus.achaychenko.colls;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> myAL = new MyArrayList<>(0);
        MyArrayList<Integer> myAL2 = new MyArrayList<>(10);
        System.out.println(myAL.size());
        System.out.println(myAL2.size());


        myAL.add(1);
        myAL.add(2);
        myAL.set(1, 5);

        Collections.addAll(myAL, 1, 2, 4, 5);
//
        System.out.println(Arrays.toString(myAL.toArray()));
        System.out.println(Arrays.toString(myAL2.toArray()));
        Collections.copy(myAL2, myAL);
//
        System.out.println(Arrays.toString(myAL.toArray()));
        System.out.println(Arrays.toString(myAL2.toArray()));
//
        System.out.println(myAL.size());
        System.out.println(myAL2.size());


        Collections.sort(myAL);
        System.out.println(Arrays.toString(myAL.toArray()));

//        addAll(Collection<? super T> c, T... elements)
//        static <T> void copy(List<? super T> dest, List<? extends T> src)
//        static <T> void sort(List<T> list, Comparator<? super T> c)
    }
}
