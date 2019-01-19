package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest extends TestBase {

    /*
    go to https://the-internet.herokuapp.com/upload
    upload file
    click upload
    verify text uploaded
     */

    @Test
    public void open(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        //when u locate on file uploads always look locator with a tag input
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile =driver.findElement(By.id("file-upload"));

        String path ="/Users/lamenay/Downloads/test.txt";
        //file upload happens here
        chooseFile.sendKeys(path);

        driver.findElement(By.id("file-submit")).click();

        //verify the file uploader



        Assert.assertTrue(driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed());
    }


}
