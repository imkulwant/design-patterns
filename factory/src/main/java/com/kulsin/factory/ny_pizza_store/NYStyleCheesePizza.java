package com.kulsin.factory.ny_pizza_store;

import com.kulsin.factory.abstract_pizza_store.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official NYPizzaStore box");
    }
}


