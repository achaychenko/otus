package ru.otus.achaychenko.colls.memory;


class LotsOfBytes
{
    StringBuilder sb = new StringBuilder();
}

class LotsOfStr
{
    String str = new String(new char[0]);
}

class LotsOfArrs
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
}

public class Test
{
    private static final int SIZE = 9000000;

    public static void main(String[] args) throws Exception
    {

//first
        System.gc();
        LotsOfBytes[] first = new LotsOfBytes[SIZE];
        long startMem = getMemory();

        for (int i=0; i < SIZE; i++)
        {
            first[i] = new LotsOfBytes();
        }

        System.gc();
        long endMem = getMemory();

        System.out.println ("Object: " + ((endMem-startMem) / ((double)SIZE)));

//second
        System.gc();
        LotsOfStr[] third = new LotsOfStr[SIZE];
        startMem = getMemory();
        for (int i=0; i < SIZE; i++)
        {
            third[i] = new LotsOfStr();
        }
        endMem = getMemory();
        System.gc();
        System.out.println ("Empty String: " + ((endMem-startMem) / ((double)SIZE)));

//third
        System.gc();
        LotsOfArrs[] fourth = new LotsOfArrs[SIZE];
        startMem = getMemory();
        for (int i=0; i < SIZE; i++)
        {
            fourth[i] = new LotsOfArrs();
        }
        System.gc();
        endMem = getMemory();
        System.out.println ("Array: " + ((endMem-startMem) / ((double)SIZE)));


    }

    private static long getMemory()
    {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
