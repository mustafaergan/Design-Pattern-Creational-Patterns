
package com.mustafaergan.ornek3;

public class SehirBisikletiTekerlek implements Tekerlek {
    
    private static final String genislik = "Dar";
    private static final String basinc = "Yüksek";
    
    @Override
    public void getBilgi() {
        System.out.println("Yol bisikleti lastiği genişliği: " + genislik + ", basınç: " + basinc);
    }
    
}
