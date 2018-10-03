package com.mustafaergan.ornek1;

public class Garson {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createPizza();
        pizzaBuilder.buildHamur();
        pizzaBuilder.buildSos();
        pizzaBuilder.buildMalzeme();
    }
}
