package com.mustafaergan.ornek1;

public class PizzaBuilderTest {

    public static void main(String[] args) {
        Garson garson = new Garson();
        PizzaBuilder italyanPizzaBuilder = new ItalyanPizzaBuilder();
        PizzaBuilder turkPizzaBuilder = new TurkPizzaBuilder();

        garson.setPizzaBuilder( italyanPizzaBuilder );
        garson.constructPizza();

        Pizza pizza = garson.getPizza();
    }
}
