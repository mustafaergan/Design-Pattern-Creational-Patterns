package com.mustafaergan.ornek4;

public class Tavsan implements Cloneable {
    private int age;
    private Tur tur;
    private Kisi sahibi;


    @Override
    protected Object clone() {
        try {
            Tavsan tavsan = (Tavsan) super.clone();
            tavsan.sahibi = getSahibi().clone();
            return tavsan;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw  new AssertionError();
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTur(Tur tur) {
        this.tur = tur;
    }

    public Tur getTur() {
        return tur;
    }

    public Kisi getSahibi() {
        return sahibi;
    }

    public void setSahibi(Kisi sahibi) {
        this.sahibi = sahibi;
    }
}
