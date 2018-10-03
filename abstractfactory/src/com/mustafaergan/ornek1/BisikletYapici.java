
package com.mustafaergan.ornek1;

public class BisikletYapici {

    public static void main(String[] args) {
        
        bisikletOlusturWithoutAbstractFactory();
        
        bisikletOlusturWithAbstractFactory("dag_bisikleti");
        
    }
    
    public static void bisikletOlusturWithoutAbstractFactory() {

        DagBisikletiTekerlek dagBisikletiOnTekerlek = new DagBisikletiTekerlek();
        DagBisikletiTekerlek dagBisikletiArkaTekerlek = new DagBisikletiTekerlek();
        DagBisikletiGovde dagBisikletiGovde = new DagBisikletiGovde();
        dagBisikletiOnTekerlek.getBilgi();
        dagBisikletiArkaTekerlek.getBilgi();
        dagBisikletiGovde.getBilgi();
        System.out.println();  
        
    }
    
    public static void bisikletOlusturWithAbstractFactory(String type) {
        
        BisikletFabrikasi bisikletFabrikasi = FabrikaYaraticisi.fabrikaOlustur(type);
        Tekerlek tekerlekOn = bisikletFabrikasi.tekerlekOlustur();
        Tekerlek tekerlekArka = bisikletFabrikasi.tekerlekOlustur();
        Govde govde = bisikletFabrikasi.tekerlekGovde();
        tekerlekOn.getBilgi();
        tekerlekArka.getBilgi();
        govde.getBilgi();
        System.out.println();
        
    }
    
}
