package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeDemo {


@Test


    public void Test(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();


    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://the-internet.herokuapp.com/tinymce");

  //locate iframe
    WebElement iframe =driver.findElement(By.id("mce_0_ifr"));


    //switch to i
    // frame
    driver.switchTo().frame(iframe);

        WebElement bodyText = driver.findElement(By.tagName("body"));
        bodyText.clear();
        bodyText.sendKeys("Hi Luwam, this is my first API");

    //elemental selenium

     //switch back to ur previous frame that is a parent frame
       driver.switchTo().parentFrame();
       driver.findElement(By.linkText("Elemental Selenium")).click();





}
}
