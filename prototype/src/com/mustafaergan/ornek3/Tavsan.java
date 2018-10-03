package com.mustafaergan.ornek3;

public class Tavsan implements Cloneable {
    private int age;
    private Tur tur;
    private Kisi sahibi;


    @Override
    protected Object clone() {
        try {
            return (Tavsan) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw  new AssertionError();
        }
    }

    public void setSahibi(String sahip) {
        Kisi sahibi = new Kisi(sahip);
        this.sahibi = sahibi;
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
