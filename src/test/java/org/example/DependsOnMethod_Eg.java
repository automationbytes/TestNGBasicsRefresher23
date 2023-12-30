package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_Eg {
    @Test
    public void test1(){
        Assert.assertEquals(10,"100");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        Assert.assertEquals(10,9);
    }


}
