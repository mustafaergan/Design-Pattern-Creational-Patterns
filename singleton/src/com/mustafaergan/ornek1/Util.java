package com.mustafaergan.ornek1;


public class Util {

    private static Util uniqueInstance;

    public static Util getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Util();
        }
        return uniqueInstance;
    }

    public int topla(int a, int b) {
        return a + b;
    }


}
