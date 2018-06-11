package ru.otus.achaychenko.tests;

import org.junit.*;
import static org.junit.Assert.*;


public class MyTest {
    @Test
    public void correctSum(){
        MySource x = new MySource(3, 4);
        //Assert.assertEquals(7, x.add());

        Assert.assertEquals("Works fine", 7, x.add());

    }
}
