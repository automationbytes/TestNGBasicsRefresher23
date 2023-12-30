package org.example;

import org.testng.annotations.Test;

public class Priority_Eg {

    @Test //by default it is 0
    public void testa(){
        System.out.println("Test a");
    }

    @Test(priority = -1)
    public void testb(){
        System.out.println("Test b");
    }

    @Test
    public void testc(){
        System.out.println("Test c");
    }
}
