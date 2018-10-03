package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;

public class Mutfak {
    
    private Dimension boyut;
    private int tavanYuksekligi;
    private int katNumarasi;
    private Color duvarRengi;
    private int pencereSayisi;
    private int kapiSayisi;
    private boolean bulasikMakinesiVarMi;
    private boolean mikroDalgaVarMi;

    public Mutfak(Dimension boyut, int tavanYuksekligi, int katNumarasi, Color duvarRengi, int pencereSayisi, int kapiSayisi, boolean bulasikMakinesiVarMi, boolean mikroDalgaVarMi){
        this.boyut = boyut;
        this.tavanYuksekligi = tavanYuksekligi;
        this.katNumarasi = katNumarasi;
        this.duvarRengi = duvarRengi;
        this.pencereSayisi = pencereSayisi;
        this.kapiSayisi = kapiSayisi;
        this.bulasikMakinesiVarMi = bulasikMakinesiVarMi;
        this.mikroDalgaVarMi = mikroDalgaVarMi;
    }
}
