package ru.otus.achaychenko.colls.memory;


class LotsOfBytes
{

}

class LotsOfStr
{
    String str = new String("");
}

class LotsOfArrs
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
}

public class Test
{
    private static final int SIZE = 1000000;

    public static void main(String[] args) throws Exception
    {
        LotsOfBytes[] first = new LotsOfBytes[SIZE];
        LotsOfStr[] third = new LotsOfStr[SIZE];
        LotsOfArrs[] fourth = new LotsOfArrs[SIZE];


        System.gc();
        long startMem = getMemory();

        for (int i=0; i < SIZE; i++)
        {
            first[i] = new LotsOfBytes();
        }

        System.gc();
        long endMem = getMemory();

        System.out.println ("Object: " + ((endMem-startMem) / ((double)SIZE)));

        System.gc();
        startMem = getMemory();
        for (int i=0; i < SIZE; i++)
        {
            third[i] = new LotsOfStr();
        }
        System.gc();
        endMem = getMemory();
        System.out.println ("Empty String: " + ((endMem-startMem) / ((double)SIZE)));

        System.gc();
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
