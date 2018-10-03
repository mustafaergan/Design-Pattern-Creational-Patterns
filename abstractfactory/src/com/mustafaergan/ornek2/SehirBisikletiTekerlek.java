
package com.mustafaergan.ornek2;

public class SehirBisikletiTekerlek extends Tekerlek {
    
    private static final String genislik = "Dar";
    private static final String basinc = "Yüksek";
    
    @Override
    public void getBilgi() {
        System.out.println("Yol bisikleti lastiği genişliği: " + genislik + ", basınç: " + basinc);
    }
    
}
