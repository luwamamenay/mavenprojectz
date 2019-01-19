package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.ConfigrationReader;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageVAldiationTest extends TestBase {

    HomePage homepage = new HomePage();

    @Test

    public void wrongEmailTest(){

        HomePage homepage = new HomePage();

        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
         driver.get(ConfigrationReader.getProperty("url"));
        homepage.username.sendKeys("admin");
        //this above line is the same as saying the below code
        //driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
        homepage.password.sendKeys("test");
        homepage.loginButton.click();
        String  acyual =homepage.errorMEssage.getText();
        String expected ="Invalid Login or Password.";
        System.out.println("exp"+ expected+ "act"+acyual);

        Assert.assertEquals(acyual,expected);
    }

    @Test
    public void wrongPassWordTest(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        HomePage homepage = new HomePage();
        homepage.username.sendKeys("Tester");
        homepage.password.sendKeys("admin");
        homepage.loginButton.click();
        String  acyuall = homepage.errorMEssage.getText();

//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("admin");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//        String  acyuall =driver.findElement(By.id("ctl00_MainContent_status")).getText();

        String expectedd ="Invalid Login or Password.";
        System.out.println("exp"+ expectedd+ "act"+acyuall);

        Assert.assertEquals(acyuall,expectedd);

    }

    @Test

    public void noEmailTest(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homepage.login("","test");

        String  acyualll = homepage.errorMEssage.getText();


        String expecteddd ="Invalid Login or Password.";
        System.out.println("exp"+ expecteddd+ "act"+acyualll);

        Assert.assertEquals(acyualll,expecteddd);

    }

    @Test

            public void blankPassword() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homepage.login("Tester","");
        String acyuallll = homepage.errorMEssage.getText();
        String expectedddd = "Invalid Login or Password.";
        System.out.println("exp" + expectedddd + "act" + acyuallll);

        Assert.assertEquals(acyuallll, expectedddd);
    }
}
