package com.mustafaergan.ornek1;

abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza() {
        pizza = new Pizza();
    }

    public abstract void buildHamur();
    public abstract void buildSos();
    public abstract void buildMalzeme();
}
