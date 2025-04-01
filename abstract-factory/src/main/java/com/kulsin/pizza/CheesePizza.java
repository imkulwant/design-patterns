package com.kulsin.pizza;

import com.kulsin.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    /**
     * To make a pizza now, we need a factory to provide the ingredients. So each Pizza
     * class gets a factory passed into its constructor, and it’s stored in an instance variable.
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * The prepare() method steps through creating a cheese pizza, and each time it needs an
     * ingredient, it asks the factory to produce it.
     * <p>
     * The Pizza class uses an ingredient factory to produce region-specific ingredients without being tied to those
     * regional differences. By using this composition with the Abstract Factory pattern, the Pizza class remains
     * decoupled from the specific ingredients used (like marinara sauce for NY) and can be easily reused with
     * different regional factories.
     */
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
