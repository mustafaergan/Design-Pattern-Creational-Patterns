package com.mustafaergan.ornek1;

public class TurkPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildHamur() {
        pizza.setHamur("kalın");
    }

    @Override
    public void buildSos() {
        pizza.setSos("biber sosu");
    }

    @Override
    public void buildMalzeme() {
        pizza.setMalzeme("mozeralla+zeytin+pastırma");
    }
}
