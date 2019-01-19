package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FaceBookPractice {
 WebDriver driver;

    @BeforeMethod

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().getPosition();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement search = driver.findElement(By.xpath(" //input[@value='Go']"));



    }

    @Test

    public void setUp(){
        WebElement search = driver.findElement(By.xpath(" //input[@value='Go']"));
        String searchBtn = search.getText();
        System.out.println("search is clicking  " +searchBtn);
    }

    @Test(dependsOnMethods = "setUp")

    public void searchingitem() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("iphone 7"+ Keys.ENTER);



    }









}
