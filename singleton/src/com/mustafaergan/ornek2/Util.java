package com.mustafaergan.ornek2;


public class Util {

    private static Util uniqueInstance;

    private static boolean initialized = false;

    public static Util getInstance() {
        if(initialized){
            return uniqueInstance;
        }else{
            initialized = true;
            return new Util();
        }
    }

    public int topla(int a, int b) {
        return a + b;
    }


}
