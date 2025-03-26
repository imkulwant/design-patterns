package com.kulsin.factory.ny_pizza_store;

import com.kulsin.factory.abstract_pizza_store.Pizza;
import com.kulsin.factory.abstract_pizza_store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }

}
