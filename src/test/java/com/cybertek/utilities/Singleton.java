package com.cybertek.utilities;

public class Singleton {

    private static String str;
    private Singleton(){}

    public static String get(){
        if(str==null){
            System.out.println("adding vlue");
            str ="bsncbdshc";
        }
        return str;
    }
}
