package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;

public class MutfakBuilder implements Builder{
    
    private Dimension boyut;
    private int tavanYuksekligi;
    private int katNumarasi;
    private Color duvarRengi;
    private int pencereSayisi;
    private int kapiSayisi;
    private boolean bulasikMakinesiVarMi;
    private boolean mikroDalgaVarMi;
    
    public MutfakBuilder() {}
    
    @Override
    public MutfakBuilder setBoyut(Dimension boyut) {
        this.boyut = boyut;
        return this;
    }

    @Override
    public MutfakBuilder setTavanYuksekligi(int ceilingHeight) {
        this.tavanYuksekligi = ceilingHeight;
        return this;
    }

    @Override
    public MutfakBuilder setKatNumarasi(int katNumarasi) {
        this.katNumarasi = katNumarasi;
        return this;
    }

    @Override
    public MutfakBuilder setDuvarRengi(Color duvarRengi) {
        this.duvarRengi = duvarRengi;
        return this;
    }

    @Override
    public MutfakBuilder setPencereSayisi(int pencereSayisi) {
        this.pencereSayisi = pencereSayisi;
        return this;
    }

    @Override
    public MutfakBuilder setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
        return this;
    }
    
    
}
