package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Eg {
    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(10,10);
    }

    @Test(groups = {"Regression"})
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(10,9);
    }



    @Test(groups = {"Regression"})
    public void test3(){
        Assert.assertNotEquals(10,9);
    }

    @Test
    public void test4(){
        Assert.assertTrue(1 == 2);
    }


}
