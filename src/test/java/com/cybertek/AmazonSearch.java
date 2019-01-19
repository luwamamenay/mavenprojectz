package com.cybertek;
//open browser
//go to amazon
//eneter search term and submit
//verify search box contains the same search item

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http:amzon.com");

       // String expected ="charger";

        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("charger" + Keys.ENTER);
       // input.submit();
        String expected ="charger";
      String actual = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

      if(expected.equals(actual)){
          System.out.println("PASS");
      }else{
          System.out.println("FAIL");
          System.out.println("actual="+actual);
          System.out.println("expected="+expected);
      }







    }




}
