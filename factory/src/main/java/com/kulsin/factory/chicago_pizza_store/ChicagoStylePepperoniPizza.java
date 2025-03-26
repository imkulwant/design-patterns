package com.kulsin.factory.chicago_pizza_store;

import com.kulsin.factory.abstract_pizza_store.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Pepperoni");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 40 minutes at 325");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official ChicagoPizzaStore box");
    }
}
