package com.kulsin;

import com.kulsin.pizza_store.ChicagoPizzaStore;
import com.kulsin.pizza_store.NYPizzaStore;
import com.kulsin.pizza_store.PizzaStore;

public class PizzaOrderApp {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("pepperoni");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");


    }

}
