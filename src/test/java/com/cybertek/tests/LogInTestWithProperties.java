package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.ConfigrationReader;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class LogInTestWithProperties  extends TestBase {

  @Test
    public void readpropertyTest(){
     // String browser = ConfigrationReader.getProperty("browser");//this "browser"


     // System.out.println(browser);


      driver.get(ConfigrationReader.getProperty("url"));
      HomePage homePage = new HomePage();

      String username = ConfigrationReader.getProperty("username");
      String password =ConfigrationReader.getProperty("password");
      homePage.login(username,password);



  }

}
