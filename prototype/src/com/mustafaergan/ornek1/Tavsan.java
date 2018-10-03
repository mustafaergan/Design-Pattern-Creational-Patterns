package com.mustafaergan.ornek1;

public class Tavsan implements Cloneable {
    private int age;
    private Tur tur;


    @Override
    protected Object clone() {
        try {
            return (Tavsan) super.clone();
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
}
