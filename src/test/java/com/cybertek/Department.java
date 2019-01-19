package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Department {

    public static void main(String[] args) {

      //1 open browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

      //2 go to amazon
        driver.get("https://amazon.com");

      // 3 verifythat default dropdown option is all








    }


}
