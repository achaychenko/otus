package ru.otus.achaychenko.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tully.
 */
class Benchmark implements BenchmarkMBean {
    private volatile int size = 0;
    public int cycle = 0;

    @SuppressWarnings("InfiniteLoopStatement")
    void run() {

        System.out.println("Starting the loop");
        while (true) {
            System.out.println(cycle++);
            int local = size;
            List<Long> array = new ArrayList<>();
            System.out.println();

            for (int i = 0; i < local; i++) {
                array.add(1232L);
            }

            System.out.println("Array of size: " + array.size() + " created");

            for(int k = local-1; k > local/2; k--){
                array.remove(k);
            }
            System.out.println("Removed " + local + " objects.");
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

}
