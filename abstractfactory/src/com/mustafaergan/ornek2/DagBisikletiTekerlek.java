package com.mustafaergan.ornek2;

public class DagBisikletiTekerlek extends Tekerlek {

    private static final String genislik = "Genis";

    private static final String basinc = "Orta";
    
    @Override
    public void getBilgi() {
        System.out.println("Dag bisikleti lastiği genişliği: " + genislik + ", basınç: " + basinc);
    }

}
