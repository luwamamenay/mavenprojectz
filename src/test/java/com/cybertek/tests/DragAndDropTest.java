package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {


    @Test

    public void test() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target =driver.findElement(By.id("droptarget"));


       // Thread.sleep(1000);
        //pass the variable in the correct order, first one is source ,second one is target
        actions.dragAndDrop(source,target).perform();

    }


    @Test
    public void test2(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target =driver.findElement(By.id("droptarget"));

        //write the steps for doing drag and drop operation with out using
        //dragAndDrop();method

        //one way of doing it
        //when we use multiple actions we need to add build()before we perform();
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().perform();



        //the same oth the above but in separate lines
//        actions.
//                clickAndHold(source).
//                   moveToElement(target).
//                    release().
//                     perform();
    }
}
