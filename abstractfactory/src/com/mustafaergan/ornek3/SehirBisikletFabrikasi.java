
package com.mustafaergan.ornek3;

public class SehirBisikletFabrikasi implements BisikletFabrikasi {

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
