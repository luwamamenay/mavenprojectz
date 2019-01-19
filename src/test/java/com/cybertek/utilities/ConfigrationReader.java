package com.cybertek.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {

    private static Properties properties;

    static {
        //this the path to the location of the file
        String path ="configration.properties";

        try {
            //,java can not read file dirctely,it needs inputstream to read files
            //and inputStream takes the lovcation of the file as a constractor
            FileInputStream fileInputStream = new FileInputStream(path);

           //properties class is used to read specifically peporties files,files
            //with key value pairs
            properties = new Properties();

            //file contenets are loaded to properties from the inputstream
            properties.load(fileInputStream);

           //all input Streams must be closed
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //returen the value of a specific property
   public static  String getProperty(String property){
        return properties.getProperty(property);
   }


}



