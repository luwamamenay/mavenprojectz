package com.cybertek.tests;
/*
open chrome nd go to google
enter search for selenium cookbook
verify title contains the search item

 */

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GopgleDemo extends TestBase {


    @Test
    public void titleTest(){
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("selenium cookbook"+ Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("selenium cookbook"));




    }






}
