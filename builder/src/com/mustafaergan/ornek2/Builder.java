package com.mustafaergan.ornek2;

import java.awt.Color;
import java.awt.Dimension;

public interface Builder {

    Builder setTavanYuksekligi(int tavanYuksekligi);

    Builder setBoyut(Dimension boyut);

    Builder setKatNumarasi(int katNumarasi);

    Builder setKapiSayisi(int kapiSayisi);

    Builder setPencereSayisi(int pencereSayisi);
    
    Builder setDuvarRengi(Color duvarRengi);
    
}
