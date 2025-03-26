package com.kulsin.factory;

import com.kulsin.factory.abstract_pizza_store.PizzaStore;
import com.kulsin.factory.chicago_pizza_store.ChicagoPizzaStore;
import com.kulsin.factory.ny_pizza_store.NYPizzaStore;

public class PizzaOrderApp {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("pepperoni");



        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");


    }

}
