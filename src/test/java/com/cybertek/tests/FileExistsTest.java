package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;


public class FileExistsTest extends TestBase{


@Test
public void test(){
    String current = System.getProperty("user.dir");

    System.out.println(current);

    String userFolder = System.getProperty("user.home");
    System.out.println(userFolder);

    String path = userFolder+"/DownLoads/test.txt";
    System.out.println(path);


    //Files.exists(Paths.get(path)) ->returns true if it passes
   Assert.assertTrue(Files.exists(Paths.get(path)));



}

}
