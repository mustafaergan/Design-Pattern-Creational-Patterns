
package com.mustafaergan.ornek1;

public class SehirBisikletFabrikasi extends BisikletFabrikasi {
    
    @Override
    public Tekerlek tekerlekOlustur() {
        return new SehirBisikletiTekerlek();
    }
    
    @Override
    public Govde tekerlekGovde() {
        return new SehirBisikletiGovde();
    }
    
}
