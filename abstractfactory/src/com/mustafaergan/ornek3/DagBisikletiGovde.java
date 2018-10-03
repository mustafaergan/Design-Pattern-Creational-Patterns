
package com.mustafaergan.ornek3;

public class DagBisikletiGovde implements Govde {
    
    private static String tip = "Düz";
    
    @Override
    public void getBilgi() {
        System.out.println("Dağ bisikleti govde tipi:" + tip);
    }
    
}
