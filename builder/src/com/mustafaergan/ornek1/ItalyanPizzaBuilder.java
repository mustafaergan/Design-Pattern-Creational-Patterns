package com.mustafaergan.ornek1;

public class ItalyanPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildHamur() {
        pizza.setHamur("ince");
    }

    @Override
    public void buildSos() {
        pizza.setSos("salca");
    }

    @Override
    public void buildMalzeme() {
        pizza.setMalzeme("mozeralla+zeytin");
    }
}
