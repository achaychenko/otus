package ru.otus.achaychenko.gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

            int youngCount = 0;
            int youngTime = 0;
            int oldCount = 0;
            int oldTime = 0;

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
                if(mxBean.getName().equals("G1 Young Generation")){
                    youngCount += mxBean.getCollectionCount();
                    youngTime += mxBean.getCollectionTime();
                }else if(mxBean.getName().equals("Old Generation")){
                    oldCount += mxBean.getCollectionCount();
                    oldTime += mxBean.getCollectionTime();
                }

            }
            if((System.currentTimeMillis() - startTime) > 60 * 1000){
                System.out.println("youngCount: " + youngCount);
                System.out.println("youngTime: " + youngTime);
                System.out.println("oldCount: " + oldCount);
                System.out.println("oldTime: " + oldTime);
                startTime = System.currentTimeMillis();
                youngCount = 0;
                youngTime = 0;
                oldCount = 0;
                oldTime = 0;

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
