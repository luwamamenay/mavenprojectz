package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class smokeTest {



    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

    }


    @Test(priority = 1)
    public void price() throws InterruptedException {

        driver.get("http://automationpractice.com/index.php");

        Thread.sleep(1500);
        WebElement shirtText1 = driver.findElement(By.xpath("//a[@class='product-name']"));

        String shirtTextBeforeClick = shirtText1.getText();
        System.out.println("Price before clicking the product: " + shirtTextBeforeClick );


        WebElement shirtPrice = driver.findElement(By.xpath("//span[@class='price product-price']"));

        String shirtPriceBeforeClick = shirtPrice.getText();

        System.out.println("Shirt price before clicking the porduct: " + shirtPriceBeforeClick);

        shirtText1.click();

        WebElement shirtText2 = driver.findElement(By.xpath("//h1[.='Faded Short Sleeve T-shirts']"));
        String shirtAfterClick = shirtText2.getText();
        System.out.println( "Shirt price after looking product: " + shirtAfterClick );

        Assert.assertTrue(shirtTextBeforeClick.equals(shirtAfterClick));

    }

//
//    @Test (priority = 2)
//    public void details(){
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement quantity = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//input[@id='quantity_wanted']"));
//
//        System.out.println(quantity.getText());
//
//
//    }

    @Test(priority = 2)
    public void details() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement defaultQuantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
        defaultQuantity.getText();
        String quantityText = defaultQuantity.getText();

        System.out.println(quantityText);
    }
}