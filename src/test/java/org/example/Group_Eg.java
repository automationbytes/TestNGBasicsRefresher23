package org.example;

import org.testng.annotations.Test;

public class Group_Eg {


        @Test
        public void testa(){
            System.out.println("Test a");
        }

        @Test(groups = {"Regression","Sanity"})
        public void testb(){
            System.out.println("Test b");
        }

        @Test(enabled = false)
        public void testc(){
            System.out.println("Test c");
        }
    }


