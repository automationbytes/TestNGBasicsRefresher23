package org.example;

import org.testng.annotations.Test;

public class TimeOut_Eg {

    @Test(timeOut = 10000)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Hello");
    }
}
