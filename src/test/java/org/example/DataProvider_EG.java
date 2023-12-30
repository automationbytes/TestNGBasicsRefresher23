package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_EG {

    @DataProvider(name = "DataTable")
    public Object[][] DTMetd(){
        return new Object[][]{{10,5},{20,8}};
    }

    @Test(dataProvider = "DataTable")
    public void add(int a, int b){
        System.out.println(a+b);
    }

    @DataProvider(name="SingleDT")
    public Object[][] singleDT(){
        return new Object[][]{{"Hello"},{"ABC"}};

    }

    @Test(dataProvider = "SingleDT")
    public void hello(String a){
        System.out.println(a);
    }
}
