package com.mustafaergan.ornek3;

public class SehirBisikletiGovde implements Govde {

    private static String tip = "Dar";

    @Override
    public void getBilgi() {
        System.out.println("Sehir bisikleti govde tipi:" + tip);
    }

}
