package com.cybertek.tests;

import org.testng.annotations.Test;

public class MethodDependenciesTest {

    @Test

    public void openBrowser(){
        System.out.println("open browser");
    }


    @Test(dependsOnMethods = "openBrowser")

    public void login(){
        System.out.println("login");
    }

    @Test(dependsOnMethods ="login" )

    public void logOut(){
        System.out.println("logout");
    }

}
