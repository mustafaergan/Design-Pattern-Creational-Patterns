
package com.mustafaergan.ornek1;


public class FabrikaYaraticisi {
    
    public static BisikletFabrikasi fabrikaOlustur(String type) {
        
        if(type.equalsIgnoreCase("dag_bisikleti")) {
            return new DagBisikletFabrikasi();
        } else if(type.equalsIgnoreCase("sehir_bisikleti")) {
            return new SehirBisikletFabrikasi();
        } else {
            System.out.println("bilinmeyen tip");
            return null;
        }
        
    }
    
}
