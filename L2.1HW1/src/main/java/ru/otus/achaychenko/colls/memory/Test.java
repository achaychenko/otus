package ru.otus.achaychenko.colls.memory;

import java.util.Arrays;

public class Test
{
    private static final int SIZE = 9000000;


    public static void main(String[] args) throws Exception
    {

//first

        System.gc();
        Object[] first = new Object[SIZE];
        long startMem = getMemory();
        for (int i=0; i < SIZE; i++)
        {
            first[i] = new Object();
        }
        System.gc();
        long endMem = getMemory();

        System.out.println ("Object: " + ((endMem-startMem) / ((double)SIZE)));

//second

        System.gc();
        String[] second = new String[SIZE];
        startMem = getMemory();
        for (int i=0; i < SIZE; i++)
        {
            second[i] = new String(new char[0]);
        }
        endMem = getMemory();
        System.gc();
        System.out.println ("Empty String: " + ((endMem-startMem) / ((double)SIZE)));

//third
        System.gc();
        int[][] third = new int[SIZE][];

        startMem = getMemory();
        for (int i=0; i < SIZE; i++){

            third[i] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        }
        endMem = getMemory();
        System.gc();

        System.out.println ("Array 10 ints: " + ((endMem-startMem) / ((double)SIZE)));

        System.out.println(first.length);
        System.out.println(second.length);
        System.out.println(third.length);
    }

    private static long getMemory()
    {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
