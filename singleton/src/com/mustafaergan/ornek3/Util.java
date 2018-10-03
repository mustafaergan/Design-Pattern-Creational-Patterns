package com.mustafaergan.ornek3;


public class Util {

    private static final Util uniqueInstance = new Util();

    private static boolean initialized = false;

    public static synchronized Util getInstance() {
        if(initialized){
            return uniqueInstance;
        }else{
            initialized = true;
            return uniqueInstance;
        }
    }

    public int topla(int a, int b) {
        return a + b;
    }


}
