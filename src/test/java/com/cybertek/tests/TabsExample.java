package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabsExample {

    WebDriver driver;



    //verify that new title is “New window”
   // verify that new title is not “The internet”



    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    // Test case:
    //go to http://the-internet.herokuapp.com/windows
    //click on click “Click here”

    public void changeTab(){
        System.out.println(driver.getWindowHandles().size());//gives the ids of all current open tabs
        System.out.println(driver.getWindowHandle());//prints the id of current open tab
     driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getWindowHandles().size());
        //verify that new title is “New window”

        //change to new tab
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("************************");

        for (String handle : windowHandles) {
            System.out.println(handle);

            //switching tabs
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if(driver.getTitle().equals("New Window")){
                break;
            }
            else
                driver.switchTo().window(handle);
        }

        Assert.assertEquals(driver.getTitle(),"New Window");


        // verify that new title is not “The internet”

        Assert.assertNotEquals(driver.getTitle(),"The Intenet");


    }

    @Test
    public void changeTabe2(){
        driver.get("https://www.w3schools.com/html/");
        driver.findElement(By.linkText("Try it Yourself »")).click();

        //title of the second Tryit Editor v3.6
        //

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if(driver.getTitle().equals("Tryit Editor v3.6")){
                break;
            }
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("default"));

        System.out.println(driver.getWindowHandles().size());
        driver.close();

        System.out.println(driver.getWindowHandles().size());

    }
}
