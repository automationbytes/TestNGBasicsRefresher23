package org.example;

import org.testng.annotations.*;

public class AnnotationEg {


    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }



    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void a_1_stawberry(){
        System.out.println("Test Stawberry");
    }


    @Test
    public void a_2_pineapple(){
        System.out.println("Test PineApple");
    }

    @Test
    public void a_3_apple(){
        System.out.println("Test Apple");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

}
