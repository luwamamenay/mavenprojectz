package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sports {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

        driver.manage().window().fullscreen();

        WebElement football = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input"));

        if (football.isSelected()){
           System.out.println("Football is selected by default");
       } else {
           System.out.println("Football is not selected by default");
       }



        WebElement Baseball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input"));

        WebElement Basketball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input"));

        WebElement Hockey = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input"));

        WebElement Soccer = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Soccer-input"));

        WebElement WaterPolo = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-WaterPolo-input"));

        Random random = new Random();

        int temp = random.nextInt(5);



        List <WebElement> sports = new ArrayList<WebElement>();

        sports.add(Baseball);
        sports.add(Basketball);
        sports.add(football);
        sports.add(Hockey);
        sports.add(Soccer);
        sports.add(WaterPolo);

        WebElement randomSport = sports.get(temp);

        for (int idx = 0; idx < sports.size(); idx++){

            if (randomSport == Baseball){
                Baseball.click();
                System.out.println("Baseball is selected");
                break;
            }else if (randomSport == Basketball){
                Basketball.click();
                System.out.println("Basketball is selected");
                break;
            } else if (randomSport == football){
                football.click();
                System.out.println("Football is selected");
                break;
            } else if (randomSport == Hockey){
                Hockey.click();
                System.out.println("Hockey is selected");
                break;
            } else if (randomSport == Soccer){
                Soccer.click();
                System.out.println("Soccer is selected");
                break;
            } else {
                WaterPolo.click();
                System.out.println("Water Polo is selected");
                break;
            }
        }


    }
}
