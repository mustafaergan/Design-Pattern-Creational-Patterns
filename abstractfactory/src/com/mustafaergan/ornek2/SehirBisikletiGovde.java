package com.mustafaergan.ornek2;

public class SehirBisikletiGovde extends Govde {

    private static String tip = "Dar";

    @Override
    public void getBilgi() {
        System.out.println("Sehir bisikleti govde tipi:" + tip);
    }

}
