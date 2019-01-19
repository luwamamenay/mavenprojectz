package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollTest extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_UP).perform();

        //Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

    }

}
