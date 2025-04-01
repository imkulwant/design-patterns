package com.kulsin.ingredients;

import com.kulsin.ingredients.cheese.Cheese;
import com.kulsin.ingredients.cheese.Mozzarella;
import com.kulsin.ingredients.clams.Clams;
import com.kulsin.ingredients.clams.FrozenClams;
import com.kulsin.ingredients.dough.Dough;
import com.kulsin.ingredients.dough.ThickCrustDough;
import com.kulsin.ingredients.pepperoni.Pepperoni;
import com.kulsin.ingredients.pepperoni.SlicedPepperoni;
import com.kulsin.ingredients.sauce.PlumTomatoSauce;
import com.kulsin.ingredients.sauce.Sauce;
import com.kulsin.ingredients.veggies.BlackOlives;
import com.kulsin.ingredients.veggies.EggPlant;
import com.kulsin.ingredients.veggies.Spinach;
import com.kulsin.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
