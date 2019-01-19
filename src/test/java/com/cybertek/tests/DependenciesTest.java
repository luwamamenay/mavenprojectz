package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {


    @Test
    public void login(){
        System.out.println("login");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "login")
    public void zbuySth(){
        System.out.println("buy buy baby");
    }

    @Test(priority = 5)//to make it run last
    public void homePage(){
        System.out.println("Home page");
    }





}
