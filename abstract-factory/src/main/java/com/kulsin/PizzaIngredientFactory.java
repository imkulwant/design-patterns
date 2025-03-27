package com.kulsin;

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
