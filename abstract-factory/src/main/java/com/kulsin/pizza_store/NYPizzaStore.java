package com.kulsin.pizza_store;


import com.kulsin.ingredients.NYPizzaIngredientFactory;
import com.kulsin.ingredients.PizzaIngredientFactory;
import com.kulsin.pizza.CheesePizza;
import com.kulsin.pizza.ClamPizza;
import com.kulsin.pizza.PepperoniPizza;
import com.kulsin.pizza.Pizza;
import com.kulsin.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }

        return pizza;
    }

}
