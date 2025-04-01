package com.kulsin.ingredients;

import com.kulsin.ingredients.cheese.Cheese;
import com.kulsin.ingredients.clams.Clams;
import com.kulsin.ingredients.dough.Dough;
import com.kulsin.ingredients.pepperoni.Pepperoni;
import com.kulsin.ingredients.sauce.Sauce;
import com.kulsin.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    /**
     * For each ingredient we define a create method in our interface.
     */
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
