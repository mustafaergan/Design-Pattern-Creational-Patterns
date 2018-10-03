
package com.mustafaergan.ornek1;

public class DagBisikletFabrikasi extends BisikletFabrikasi {
    
    @Override
    public Tekerlek tekerlekOlustur() {
        return new DagBisikletiTekerlek();
    }
    
    @Override
    public Govde tekerlekGovde() {
        return new DagBisikletiGovde();
    }
    
}
