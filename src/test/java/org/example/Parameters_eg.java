package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_eg {

    @Test
    @Parameters({"a","b"})
    public void add(int a, int b) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(a+b);
    }

    @Test
    @Parameters({"a","b"})
    public void sub(int a, int b) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(a-b);
    }
}
