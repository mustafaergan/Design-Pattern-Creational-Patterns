
package com.mustafaergan.ornek2;

public class SehirBisikletFabrikasi extends BisikletFabrikasi {

    @Override
    public BisikletParcalari olustur(String type) {
        if (type.equalsIgnoreCase("tekerlek")) {
            return new SehirBisikletiTekerlek();
        } else if (type.equalsIgnoreCase("govde")) {
            return new SehirBisikletiGovde();
        } else {
            return null;
        }
    }
    
}
