package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;


public class YatakOdasiBuilder implements Builder {

    private Dimension boyut;
    private int tavanYuksekligi;
    private int katNumarasi;
    private Color duvarRengi;
    private int pencereSayisi;
    private int kapiSayisi;
    private boolean ciftKisilikMi;
    private boolean ebeveynBanyosuVarMi;

    public YatakOdasiBuilder() {
    }

    @Override
    public YatakOdasiBuilder setBoyut(Dimension boyut) {
        this.boyut = boyut;
        return this;
    }

    @Override
    public YatakOdasiBuilder setTavanYuksekligi(int ceilingHeight) {
        this.tavanYuksekligi = ceilingHeight;
        return this;
    }

    @Override
    public YatakOdasiBuilder setKatNumarasi(int katNumarasi) {
        this.katNumarasi = katNumarasi;
        return this;
    }

    @Override
    public YatakOdasiBuilder setDuvarRengi(Color duvarRengi) {
        this.duvarRengi = duvarRengi;
        return this;
    }

    @Override
    public YatakOdasiBuilder setPencereSayisi(int pencereSayisi) {
        this.pencereSayisi = pencereSayisi;
        return this;
    }

    @Override
    public YatakOdasiBuilder setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
        return this;
    }

    public YatakOdasiBuilder setCiftKisilikMi(boolean isDouble) {
        this.ciftKisilikMi = isDouble;
        return this;
    }

    public YatakOdasiBuilder setEbeveynBanyosuVarMi(boolean ebeveynBanyosuVarMi) {
        this.ebeveynBanyosuVarMi = ebeveynBanyosuVarMi;
        return this;
    }

    public YatakOdasi createYatakOdasi() {
        return new YatakOdasi(boyut, tavanYuksekligi, katNumarasi, duvarRengi, pencereSayisi, kapiSayisi, ciftKisilikMi, ebeveynBanyosuVarMi);
    }
    
}
