
package com.mustafaergan.ornek2;

public class DagBisikletiGovde extends Govde {
    
    private static String tip = "Düz";
    
    @Override
    public void getBilgi() {
        System.out.println("Dağ bisikleti govde tipi:" + tip);
    }
    
}
