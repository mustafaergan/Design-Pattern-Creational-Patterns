
package com.mustafaergan.ornek2;

public class BisikletYapici {

    public static void main(String[] args) {
        bisikletOlusturWithExtensibleAbstractFactory("dag_bisikleti");
    }

    public static void bisikletOlusturWithExtensibleAbstractFactory(String type) {
        BisikletFabrikasi bisikletFabrikasi = FabrikaYaraticisi.fabrikaOlustur(type);
        Tekerlek tekerlekOn = (Tekerlek) bisikletFabrikasi.olustur("tekerlek");
        tekerlekOn.getBilgi();
        Tekerlek tekerlekArka = (Tekerlek) bisikletFabrikasi.olustur("tekerlek");
        tekerlekArka.getBilgi();
        Govde handlebar = (Govde) bisikletFabrikasi.olustur("govde");
        handlebar.getBilgi();
    }
    

}
