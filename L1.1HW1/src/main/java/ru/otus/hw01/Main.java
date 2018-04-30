package ru.otus.hw01;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("It's started");
        List<Integer> lss = new ArrayList<>();
        for (int i=0; i < 10000; i++){
            lss.add(i);
        }
        System.out.println("It's finished");

        List<Integer> rlist = Lists.reverse(lss);

        System.out.println("reverse Finished!");

    }
}
