package com.mustafaergan.ornek2;


import java.util.HashMap;
import java.util.Map;

public class KisiFabrikasi {

    private static final Map<String, Kisi> prototypes = new HashMap<>();

    static {
        prototypes.put("mustafa", new Mustafa());
        prototypes.put("ahmet", new Ahmet());
    }

    public static Kisi getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            throw new NullPointerException();
        }
    }

    public static Kisi getPrototype(String type,int yas) {
        try {
            return prototypes.get(type).clone(yas);
        } catch (NullPointerException ex) {
            throw new NullPointerException();
        }
    }

}
