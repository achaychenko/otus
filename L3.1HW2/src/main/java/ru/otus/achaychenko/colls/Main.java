package ru.otus.achaychenko.colls;

import java.util.List;
import java.util.Collections;
import java.util.Iterator;

import static javafx.scene.input.KeyCode.T;

public class Main {

    public static void main(String[] args) {
//        MyGeneric<Integer> intObj = new MyGeneric<>(1);
//
//        System.out.println(intObj.getValue());
        MyArrayList<Integer> myAL = new MyArrayList<>();
        MyArrayList<Integer> myAL2 = new MyArrayList<>();
        myAL.add(1);
        myAL.add(2);
        System.out.println(myAL.set(1, 44));
//        Collections.addAll(myAL, 1, 2, 4, 5);
//
//
//        Collections.copy(myAL2, myAL);


//        MyArrayList<Integer> myAl2 = new MyArrayList<>();
//        Collections.copy(myAl2, myAL);
        System.out.println(myAL.toString());

//        Collections.sort(myAL);
//        System.out.println(Arrays.toString(myAL.toArray()));

//        addAll(Collection<? super T> c, T... elements)
//        static <T> void copy(List<? super T> dest, List<? extends T> src)
//        static <T> void sort(List<T> list, Comparator<? super T> c)
    }
}
