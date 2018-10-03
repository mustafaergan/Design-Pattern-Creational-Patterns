package com.mustafaergan.ornek4;;


public class Kisi implements Cloneable{

    private String isim;

    public Kisi(String isim) {

        this.isim = isim;

    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public Kisi clone() {
        try {
            return (Kisi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
