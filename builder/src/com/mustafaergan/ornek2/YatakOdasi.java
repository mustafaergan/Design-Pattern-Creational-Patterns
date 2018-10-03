package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;

public class YatakOdasi {
    
    private Dimension boyut;
    private int tavanYuksekligi;
    private int katNumarasi;
    private Color duvarRengi;
    private int pencereSayisi;
    private int kapiSayisi;
    private boolean ciftKisilikMi;
    private boolean ebeveynBanyosuVarMi;
    
    public YatakOdasi(Dimension boyut, int tavanYuksekligi, int katNumarasi, Color duvarRengi, int pencereSayisi, int kapiSayisi, boolean ciftKisilikMi, boolean ebeveynBanyosuVarMi){
        this.boyut = boyut;
        this.tavanYuksekligi = tavanYuksekligi;
        this.katNumarasi = katNumarasi;
        this.duvarRengi = duvarRengi;
        this.pencereSayisi = pencereSayisi;
        this.kapiSayisi = kapiSayisi;
        this.ciftKisilikMi = ciftKisilikMi;
        this.ebeveynBanyosuVarMi = ebeveynBanyosuVarMi;
    }
    
}
