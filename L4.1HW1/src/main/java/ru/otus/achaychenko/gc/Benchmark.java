package ru.otus.achaychenko.gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.*;

/**
 * Created by tully.
 */
class Benchmark implements BenchmarkMBean {
    private volatile int size = 0;
    public int cycle = 0;

    @SuppressWarnings("InfiniteLoopStatement")
    List<java.lang.management.GarbageCollectorMXBean> mxBeans = ManagementFactory.getGarbageCollectorMXBeans();
    void run() {

        long startTime = System.currentTimeMillis();

        System.out.println("Starting the loop");
        while (true) {

            Map<String, Long> gcData = new HashMap<>();


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
            for(GarbageCollectorMXBean mxBean : mxBeans){
                //System.out.println(mxBean.getName() + " " + mxBean.getCollectionTime() +" " + mxBean.getCollectionCount());

                gcData.put(mxBean.getName().replace(" ", "_") + "_time", mxBean.getCollectionTime());
                gcData.put(mxBean.getName().replace(" ", "_") + "count", mxBean.getCollectionCount());


            }
            if((System.currentTimeMillis() - startTime) > 60 * 1000){
                startTime = System.currentTimeMillis();
                System.out.println(gcData);
                gcData.clear();


            }
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
