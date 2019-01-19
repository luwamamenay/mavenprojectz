package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollingDown extends TestBase {

    @Test

    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement scrolltohelpLink = driver.findElement(By.xpath("(//a[.='Help'])[2]"));
        Thread.sleep(1000);
        actions.moveToElement( scrolltohelpLink).perform();

        scrolltohelpLink.click();

    }
}
