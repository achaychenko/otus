package ru.otus.achaychenko.colls;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Integer> intObj = new MyGeneric<>(1);

        System.out.println(intObj.getValue());
    }
}
