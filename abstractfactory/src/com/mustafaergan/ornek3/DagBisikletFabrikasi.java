
package com.mustafaergan.ornek3;

public class DagBisikletFabrikasi implements BisikletFabrikasi {
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
