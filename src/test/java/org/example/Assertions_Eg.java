package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Eg {
    @Test
    public void test1(){
        Assert.assertEquals(10,10);
    }

    @Test
    public void test2(){
        Assert.assertEquals(10,9);
    }



    @Test
    public void test3(){
        Assert.assertNotEquals(10,9);
    }

    @Test
    public void test4(){
        Assert.assertTrue(1 == 2);
    }


}
