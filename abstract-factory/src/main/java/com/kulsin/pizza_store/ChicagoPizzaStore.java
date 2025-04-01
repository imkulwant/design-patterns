package com.kulsin.pizza_store;

import com.kulsin.ingredients.ChicagoPizzaIngredientFactory;
import com.kulsin.ingredients.PizzaIngredientFactory;
import com.kulsin.pizza.CheesePizza;
import com.kulsin.pizza.ClamPizza;
import com.kulsin.pizza.PepperoniPizza;
import com.kulsin.pizza.Pizza;
import com.kulsin.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }

        };

        return pizza;
    }

}
