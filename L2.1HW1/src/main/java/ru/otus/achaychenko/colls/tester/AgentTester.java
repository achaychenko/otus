package ru.otus.achaychenko.colls.tester;

import ru.otus.achaychenko.colls.agent.AgentMemoryCounter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.lang.Integer;

public class AgentTester {
    public static void main(String[] args) {
        Byte a = 3;
        System.out.println(a.SIZE);
        printObjectSize((byte)4);
        printObjectSize(a);
        printObjectSize(5.7);
        printObjectSize(5.4f);
        printObjectSize(new Object());
        printObjectSize("d");
        printObjectSize(487867867);
        printObjectSize(new Object());
        printObjectSize(new A());
        printObjectSize(1);
        printObjectSize(Calendar.getInstance());
        printObjectSize(new BigDecimal("999999999999999.999"));
        printObjectSize(new ArrayList<String>());
        printObjectSize(new Integer[100]);
    }

    public static void printObjectSize(Object obj) {
        if (obj == null){
            throw new IllegalStateException("Null object");
        }else {
            System.out.println(String.format("%s, size=%s", obj.getClass()
                    .getSimpleName(), AgentMemoryCounter.getSize(obj)));
        }
    }
}

class A {
    Integer id;
    String name;
}
