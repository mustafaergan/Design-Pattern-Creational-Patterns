package com.mustafaergan.ornek2;


public class Mustafa implements Kisi {

    int yas;

    @Override
    public Kisi clone(int yas) {
        Mustafa mustafa = new Mustafa();
        mustafa.setYas(yas);
        return mustafa;
    }

    @Override
    public Kisi clone() {
        return new Mustafa();
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public int getYas() {
        return yas;
    }
}
