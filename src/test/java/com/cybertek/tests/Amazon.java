package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
    WebDriver driver;
    @Test
    public void amzonTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement srchBox = driver.findElement(By.id("twotabsearchtextbox"));
        srchBox.sendKeys("Selenium Cookbook"+ Keys.ENTER);
    }
}
