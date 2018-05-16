package ru.otus.achaychenko.colls;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        MyGeneric<Integer> intObj = new MyGeneric<>(1);
//
//        System.out.println(intObj.getValue());
        MyArrayList<Integer> myAL = new MyArrayList<>(0);
        myAL.add(1);
        myAL.add(2);
        Collections.addAll(myAL, 1, 2, 4, 5);
        System.out.println(myAL.size());

//        MyArrayList<Integer> myAl2 = new MyArrayList<>(10);
//        Collections.copy(myAl2, myAL);
//        System.out.println(myAl2.size());

        Collections.sort(myAL, new MyComparator<>());
        System.out.println(Arrays.toString(myAL.toArray()));


    }
}
