package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;


public class Mimar {
    
    public static void main(String[] args) {
        YatakOdasi room = new YatakOdasiBuilder().setBoyut(new Dimension(200, 100)).setTavanYuksekligi(3).setKatNumarasi(2).setDuvarRengi(Color.WHITE).setPencereSayisi(2).setKapiSayisi(1).setCiftKisilikMi(true).setEbeveynBanyosuVarMi(false).createYatakOdasi();
        YatakOdasi room2 = new YatakOdasiBuilder().setBoyut(new Dimension(300, 250)).createYatakOdasi();
    }
    
}
