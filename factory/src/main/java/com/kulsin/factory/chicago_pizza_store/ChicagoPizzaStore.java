package com.kulsin.factory.chicago_pizza_store;

import com.kulsin.factory.abstract_pizza_store.Pizza;
import com.kulsin.factory.abstract_pizza_store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }

}
