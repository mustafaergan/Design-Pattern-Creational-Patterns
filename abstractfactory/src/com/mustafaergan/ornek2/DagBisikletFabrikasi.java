
package com.mustafaergan.ornek2;

public class DagBisikletFabrikasi extends BisikletFabrikasi {
    @Override
    public BisikletParcalari olustur(String type) {
        if (type.equalsIgnoreCase("tekerlek")) {
            return new DagBisikletiTekerlek();
        } else if (type.equalsIgnoreCase("govde")) {
            return new DagBisikletiGovde();
        } else {
            return null;
        }
    }
}
