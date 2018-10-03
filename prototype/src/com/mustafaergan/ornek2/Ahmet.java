package com.mustafaergan.ornek2;


public class Ahmet implements Kisi {

    int yas;

    @Override
    public Kisi clone(int yas) {
        Ahmet ahmet = new Ahmet();
        ahmet.setYas(yas);
        return ahmet;
    }

    @Override
    public Kisi clone() {
        return new Ahmet();
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public int getYas() {
        return yas;
    }
}
