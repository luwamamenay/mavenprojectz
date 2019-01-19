package com.cybertek.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void test1(){

        String a = "A";
        String b = "A";

        Assert.assertEquals(a, b);

    }

    @Test
    public void test2(){

        String a = "A";
        String b = "AAA";

        // Assert.assertEquals(a, b); //Comparing a to b, first parameter is actual and second is expected

        Assert.assertTrue(b.contains(a));

        // Assert.assertTrue(true); // just showing that if the Assert fails, the resont of the method will not execute

        System.out.println("Done");

    }

    @Test
    public void test3(){

        int num1 = 100;
        int num2 =  200;

        Assert.assertEquals(num1, num2);
    }

    @Test
    public void test4(){

        // WebElement element = null;

        // Assert.assertTrue(element.isDisplayed());

        String a = "ADAFD";
        String b = "AAA";

        Assert.assertTrue(b.contains(a), b+ " should have contained " + a);

        //it is an overloaded method and you can pass different parameters to it.

    }

    @Test
    public void test5(){

        Assert.assertTrue(false);

    }


}

