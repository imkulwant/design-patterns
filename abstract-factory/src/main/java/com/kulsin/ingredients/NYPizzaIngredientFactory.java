package com.kulsin.ingredients;

import com.kulsin.ingredients.cheese.Cheese;
import com.kulsin.ingredients.clams.Clams;
import com.kulsin.ingredients.dough.Dough;
import com.kulsin.ingredients.clams.FreshClams;
import com.kulsin.ingredients.veggies.Garlic;
import com.kulsin.ingredients.sauce.MarinaraSauce;
import com.kulsin.ingredients.pepperoni.Pepperoni;
import com.kulsin.ingredients.cheese.ReggianoCheese;
import com.kulsin.ingredients.sauce.Sauce;
import com.kulsin.ingredients.pepperoni.SlicedPepperoni;
import com.kulsin.ingredients.dough.ThinCrustDough;
import com.kulsin.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
